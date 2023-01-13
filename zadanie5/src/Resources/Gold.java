package Resources;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Gold implements Resource{

    private final double minPrice = 60;
    private final double maxPrice = 90;
    public int resID = 0;
    public int dropChance = 0;

    public String name = "Gold";

    public Gold() {
        setResID(28);
        setDropChance(40);
    }

    @Override
    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    @Override
    public int getDropChance() {
        return dropChance;
    }

    public void setDropChance(int dropChance) {
        this.dropChance = dropChance;
    }

    @Override
    public int getProfitPerOne() {
        return (int) Math.round((ThreadLocalRandom.current().nextDouble(
                getMinPrice(),
                getMaxPrice() + 1.0)));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMinPrice() {
        return minPrice;
    }

    @Override
    public double getMaxPrice() {
        return maxPrice;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", resID=" + resID +
                ", dropChance=" + dropChance +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gold gold = (Gold) o;
        return resID == gold.resID && dropChance == gold.dropChance && name.equals(gold.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minPrice, maxPrice, resID, dropChance, name);
    }
}
