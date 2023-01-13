package Scenes;

import Player.Player;
import Player.Storage;
import Resources.Resource;

public class HappyHourMarket extends Marketplace{

    @Override
    public int sellResources(Storage s, Player p) {
        int profits = 0;
        for (Resource r : s.getContent()) {
            profits += r.getProfitPerOne();
        }
        s.getContent().clear();
        p.increaseMoney(calculateBonus(profits));

        return calculateBonus(profits);
    }

    private int calculateBonus(int profits) {
        return (int) (profits + Math.round((profits/100.0) * 50.0));
    }

    @Override
    public String toString() {
        return "HappyHourMarket{" +
                "resources=" + resources +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
