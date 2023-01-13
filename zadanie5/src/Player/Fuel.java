package Player;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Fuel {
    private final double minPricePerLitre = 0.5;
    private final double maxPricePerLitre = 2;
    private int fuel;
    private final int fuelTank = 50;
    private final int fuelConsumption = 10;
    private int price;

    public Fuel(int fuel) {
        setFuel(fuel);
        setPrice(calculateFuelPrice());
    }

    public int getCyclesToLive() {
        return fuel / fuelConsumption;
    }
    public void decreaseFuel() {
        if (fuel > 10) {
            setFuel(fuel - fuelConsumption);
        }
    }

    public void decreaseFuel(boolean isDiscounted) {
        if (fuel > 10 && isDiscounted) {
            setFuel(fuel);
        }
    }
    public final void refillTank() {
        setFuel(getFuelTank());
    }
    public final int calculateFuelPrice() {
        return (int) Math.round((ThreadLocalRandom.current().nextDouble(
                minPricePerLitre,
                maxPricePerLitre + minPricePerLitre)
                * (fuelTank - fuel)));
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuel() {
        return fuel;
    }

    private void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "minPricePerLitre=" + minPricePerLitre +
                ", maxPricePerLitre=" + maxPricePerLitre +
                ", fuel=" + fuel +
                ", fuelTank=" + fuelTank +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fuel fuel1 = (Fuel) o;
        return fuel == fuel1.fuel && price == fuel1.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minPricePerLitre, maxPricePerLitre, fuel, fuelTank, fuelConsumption, price);
    }
}
