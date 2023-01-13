package Scenes;

import Player.Player;
import Player.Storage;
import Resources.Resource;

import java.util.ArrayList;
import java.util.Objects;

public class Marketplace {

    ArrayList<Resource> resources;

    public Marketplace() {
        setResources(new ArrayList<>());
    }

    public int sellResources(Storage s, Player p) {
        int profits = 0;
        for (Resource r : s.getContent()) {
            profits += r.getProfitPerOne();
        }
        s.getContent().clear();
        p.increaseMoney(profits);

        return profits;
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "Marketplace{" +
                "resources=" + resources +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketplace that = (Marketplace) o;
        return resources.equals(that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }
}
