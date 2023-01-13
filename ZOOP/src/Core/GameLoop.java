package Core;

import Player.Fuel;
import Player.Player;
import Player.Storage;

import java.util.*;

public class GameLoop {
    public Timer t;
    public Fuel f;
    public Player p;

    public Storage s;
    private int cycles;

    private final int milis = 2000;

    private boolean randomDiscount;

    public GameLoop(int fuelAmount, int moneyAmount, int storageAmount) {
        setF(new Fuel(fuelAmount));
        setP(new Player(moneyAmount));
        setS(new Storage(storageAmount));
    }

    public void Start() {
        setT(new Timer());
        setCycles(getF().getCyclesToLive() + 1);
        getT().schedule(new Running(), new Date(), milis);
    }

    public int getCycles() {
        return cycles;
    }

    private void setCycles(int cycles) {
        this.cycles = cycles;
    }

    class Running extends TimerTask {
        private int i = 0;
        @Override
        public void run() {
            try {
                if (i == getCycles()) {
                    getF().setPrice(getF().calculateFuelPrice());
                    stopExecution("We get you back to the top. " +
                            "\nWhat do you want to do now?" +
                            "\n[1] - Refuel & try again ($" + getF().getPrice() + ")" +
                            "\n[2] - Marketplace" +
                            "\n[3] - Shop");
                }
                else if (getP().reachedMoneyLimit()) {
                    stopExecution("Sorry, but your money got too low." +
                            "\n The bank confiscated all your machinery." +
                            "\n Press '0' for the game to end.");
                }
                else {
                    if (i == 0) {
                        getF().refillTank();
                        getP().decreaseMoney(getF().getPrice());
                        setCycles(getF().getCyclesToLive() + 1); // toto si este pozri
                    }
                    else {
                        getP().setLayerScore();
                        System.out.println("Layer " + getP().getLayerScore());
                        System.out.println("[Fuel: " + getF().getFuel() + "l]");
                        System.out.println("[Money: " + getP().getMoney() + "$]");
                        getS().generateResource();
                        System.out.println("-------------------");
                        setRandomDiscount();
                        if (getRandomDiscount()) {
                            System.out.println(">You've found free fuel! " +
                                    "Your next layer will not decrease your fuel.");
                            getF().decreaseFuel(getRandomDiscount());
                        }
                        else {
                            getF().decreaseFuel();
                        }
                    }
                }
                this.i++;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        private void stopExecution(String message) {
            getT().cancel();
            System.out.println(message);
        }
    }

    public void setT(Timer t) {
        this.t = t;
    }

    public void setF(Fuel f) {
        this.f = f;
    }

    public void setP(Player p) {
        this.p = p;
    }

    public void setS(Storage s) {
        this.s = s;
    }

    public Timer getT() {
        return t;
    }

    public Fuel getF() {
        return f;
    }

    public Player getP() {
        return p;
    }

    public Storage getS() {
        return s;
    }

    public boolean getRandomDiscount() {
        return randomDiscount;
    }

    public void setRandomDiscount() {
        Random x = new Random();
        int random = x.nextInt(0,100);
        this.randomDiscount = random <= 5;
    }

    @Override
    public String toString() {
        return "GameLoop{" +
                "t=" + t +
                ", f=" + f +
                ", p=" + p +
                ", s=" + s +
                ", cycles=" + cycles +
                ", milis=" + milis +
                ", randomDiscount=" + randomDiscount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameLoop gameLoop = (GameLoop) o;
        return cycles == gameLoop.cycles && randomDiscount == gameLoop.randomDiscount && t.equals(gameLoop.t) && f.equals(gameLoop.f) && p.equals(gameLoop.p) && s.equals(gameLoop.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, f, p, s, cycles, milis, randomDiscount);
    }
}
