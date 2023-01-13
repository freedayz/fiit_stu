package Player;

import java.util.Objects;

public class Player {
    protected int money;
    private final int moneyLimit = -300;

    private int layerScore; 

    public Player(int money) {
        setMoney(money);
    }

    public boolean reachedMoneyLimit() {
        return getMoney() <= moneyLimit; // simplified ternary
    }

    public int getMoney() {
        return money;
    }

    private void setMoney(int money) {
        this.money = money;
    }

    public final void decreaseMoney(int price) {
        setMoney(getMoney() - price);
    }

    public final void increaseMoney(int price) {
        setMoney(getMoney() + price);
    }

    public int getLayerScore() {
        return layerScore;
    }

    public void setLayerScore() {
        this.layerScore += 1;
    }

    @Override
    public String toString() {
        return "Player{" +
                "money=" + money +
                ", moneyLimit=" + moneyLimit +
                ", layerScore=" + layerScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return money == player.money && layerScore == player.layerScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money, moneyLimit, layerScore);
    }
}
