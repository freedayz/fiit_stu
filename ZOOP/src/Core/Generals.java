package Core;

import Player.Storage;
import Resources.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Generals {

    private static Generals instance = new Generals();
    private String input;
    private static int scene = 0;

    private Generals() { }

    public static Generals getInstance() {
        return instance;
    }
    public static void Print(String msg) {
        System.out.println(msg);
    }

    public void ScanInput(Scanner sc) {
        this.input = sc.nextLine();
        while (!input.equals("3") &&
                !input.equals("2") &&
                !input.equals("1") &&
                !input.equals("sell all") &&
                !input.equals("fiit stu")) {

            if (input.equals("0")) {
                break;
            }
            Print("Unknown command. Maybe try again:");
            this.input = sc.nextLine();
        }
    }

    public void PrintMarketplace(Storage storage) {
        int i = 0;
        String leftAlignFormat = "| %-17s | %-7d | %-12s |%n";

        System.out.format("+-------------------+---------+--------------+%n");
        System.out.format("| Resource name     | Mined   |  Price%n");
        System.out.format("+-------------------+---------+--------------+%n");

        ArrayList<Resource> possibleResources = new ArrayList<>();
        possibleResources.add(new Coal());
        possibleResources.add(new Iron());
        possibleResources.add(new Silver());
        possibleResources.add(new Gold());
        possibleResources.add(new Diamond());
        possibleResources.add(new Kryptonite());

        for (Resource res : possibleResources) {
            i++;
            System.out.format(leftAlignFormat,
                    "[" + i + "] " + res.getName(),
                    storage.getResourceCount(res),
                    res.getProfitPerOne() + "$ p/r");
        }
        System.out.format("--------------------+---------+--------------+%n");
        Print("*p/r = per resource");
    }

    public String getInput() {
        return input;
    }

    public int getScene() {
        return scene;
    }

    public void setScene(int scene) {
        Generals.scene = scene;
    }

    @Override
    public String toString() {
        return "Generals{" +
                "input='" + input + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Generals generals = (Generals) o;
        return input.equals(generals.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input);
    }
}
