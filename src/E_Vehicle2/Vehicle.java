package E_Vehicle2;

import java.util.Scanner;

public abstract class Vehicle implements IVehicle {

    Scanner scanner = new Scanner(System.in);
    private String id;
    private String brand;
    private String model;
    private int rentalDay;
    private double rentalPricePerDay;

    public void Vehicle() {

    }

    public void Vehicle(String id, String brand, String model, int rentalDay, double rentalPricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentalDay = rentalDay;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalDay() {
        return rentalDay;
    }

    public void setRentalDay(int rentalDay) {
        this.rentalDay = rentalDay;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    @Override
    public void updateVehicle() {
        System.out.print("nhap brand: ");
        setBrand(scanner.nextLine());
        System.out.print("nhap model: ");
        setModel(scanner.nextLine());
        System.out.print("nhap rental Day: ");
        setRentalDay(scanner.nextInt());
        System.out.print("nhap rental per day: ");
        setRentalPricePerDay(scanner.nextDouble());
    }

    @Override
    public void addVehicle() {
        System.out.print("nhap id: ");
        setId(scanner.nextLine());
        System.out.print("nhap brand: ");
        setBrand(scanner.nextLine());
        System.out.print("nhap model: ");
        setModel(scanner.nextLine());
        System.out.print("nhap rental Day: ");
        setRentalDay(scanner.nextInt());
        System.out.print("nhap rental per day: ");
        setRentalPricePerDay(scanner.nextDouble());
    }

    @Override
    public void displayDetails() {
        System.out.println(getId() + " " + getBrand() + " " + getModel() + " " + getRentalDay() + " " + getRentalPricePerDay());
    }
}
