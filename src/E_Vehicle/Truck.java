package E_Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {

    Scanner sc = new Scanner(System.in);

    public Truck() {
    }

    public Truck(String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
    }
    private double loadCapacity;

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.print("trong tai: ");
        setLoadCapacity(sc.nextDouble());
        System.out.print("khoang cach: ");
        setDistance(sc.nextDouble());
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.print("trong tai: ");
        setLoadCapacity(sc.nextDouble());
        System.out.print("khoang cach: ");
        setDistance(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("trong tai: " + getLoadCapacity() + ", khoang cach: " + getDistance());
    }
}
