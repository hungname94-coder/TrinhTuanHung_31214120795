package E_Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {

    Scanner scanner = new Scanner(System.in);

    public Car() {
    }

    public Car(String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
    }
    private String fuelType;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.print("loai xang: ");
        setFuelType(scanner.nextLine());
        System.out.print("so cho ngoi: ");
        setNumberOfSeats(scanner.nextInt());
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.print("loai xang: ");
        setFuelType(scanner.nextLine());
        System.out.print("so cho ngoi: ");
        setNumberOfSeats(scanner.nextInt());
    }

    @Override
    public void displayDetails() {
        displayDetails();
        System.out.println("loai xang: " + getFuelType() + ", so cho ngoi: " + getNumberOfSeats());
    }
}
