import Core.Configurator;
import Core.GameLoop;
import Core.Generals;
import Scenes.HappyHourMarket;
import Scenes.Marketplace;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Configurator config = new Configurator();
        GameLoop gameCycle;
        boolean isNew = config.FoundNodes(new String[]{"Money", "Storage", "Fuel"});
        //-------
        Generals g = Generals.getInstance();
        // ------------------------------------------

        Generals.Print("Future ASCII Logo");
        Generals.Print("--------------------");
        Generals.Print("[1] - Start Game");
        Generals.Print("[2] - Options");
        Generals.Print("[0] - Quit");
        g.ScanInput(sc);
        g.setScene(1);

        if (isNew) {
            config.Pull();
            try {
                gameCycle = new GameLoop(Integer.parseInt(config.Get("Fuel")),
                        Integer.parseInt(config.Get("Money")),
                        Integer.parseInt(config.Get("Storage")));
            }
            catch (Exception e) {
                Generals.Print(e.getMessage());
                gameCycle = new GameLoop(50,300,100);
            }
        }
        else {
            gameCycle = new GameLoop(50,300,100);
        }

        while(!g.getInput().equals("0") && !gameCycle.getP().reachedMoneyLimit()) {
            if (g.getInput().equals("1")) {
                Generals.Print("Money: " + gameCycle.getP().getMoney() + "$" +
                        " | Storage: " + gameCycle.getS().getStorage() +
                        " | Fuel: " + gameCycle.getF().getFuel() + "l");
                gameCycle.Start();
                g.setScene(2);
            }
            else if (g.getInput().equals("2") && g.getScene() != 1) {
                Generals.Print("Welcome to the market.");
                Generals.Print("[Money: " + gameCycle.getP().getMoney() + "]");
                g.PrintMarketplace(gameCycle.getS());
                Generals.Print("\nWhat do you want to do?" +
                        "\n------------COMMANDS----------------" +
                        "\nsell all | Sells all resources in storage" +
                        "\n--------------OR--------------------" +
                        "\n[1] - Refuel & try again ($" + gameCycle.getF().getPrice() + ")" +
                        "\n[3] - Shop" +
                        "\n------------------------------------");
                g.setScene(2);

            }
            else if (g.getInput().equals("3") && g.getScene() != 1) {
                Generals.Print("Shop!");
                Generals.Print("\nWhat else do you want to do?" +
                        "\n[1] - Refuel & try again ($" + gameCycle.getF().getPrice() + ")" +
                        "\n[2] - Marketplace");
                g.setScene(2);
            }
            else if (g.getInput().equals("sell all")) {
                Random r = new Random();
                int probability = r.nextInt((100 - 5) + 1) + 5;
                if (probability <= 5) {
                    Generals.Print(">HAPPY HOUR!!");
                    HappyHourMarket market = new HappyHourMarket();
                    Generals.Print("You've sold all your resources and you earned " +
                            market.sellResources(gameCycle.getS(),gameCycle.getP()) + "$");
                    Generals.Print("Your current balance is: " + gameCycle.getP().getMoney() + "$");
                }
                else {
                    Marketplace market = new Marketplace();
                    Generals.Print("You've sold all your resources and you earned " +
                            market.sellResources(gameCycle.getS(),gameCycle.getP()) + "$");
                    Generals.Print("Your current balance is: " + gameCycle.getP().getMoney() + "$");
                }
            }
            else {
                break;
            }

            g.ScanInput(sc);
        }

        //-------
        if (gameCycle.getP().reachedMoneyLimit()) {
            if (config.Destroy()) {
                Generals.Print("Your game save was deleted and you must go from the beginning :/");
            }
            else {
                Generals.Print("Your game save wasn't deleted.");
            }
            Generals.Print("----------[THE END]----------------");
        }
        else {
            config.CommitNode("Money", String.valueOf(gameCycle.getP().getMoney()));
            config.CommitNode("Fuel", String.valueOf(gameCycle.getF().getFuel()));
            config.CommitNode("Storage", String.valueOf(gameCycle.getS().getStorage()));
            config.CommitNode("LastLayer", String.valueOf(gameCycle.getP().getLayerScore()));
            config.Push();
        }

    }
}