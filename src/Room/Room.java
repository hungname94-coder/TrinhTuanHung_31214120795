package Room;

import java.util.*;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;

    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void addRoom() {
        System.out.print("id: ");
        setId(sc.nextLine());
        System.out.print("name: ");
        setName(sc.nextLine());
        System.out.print("baseCost: ");
        setBaseCost(sc.nextDouble());
    }

    @Override
    public void updateRoom() {
        sc.nextLine();
        System.out.print("name: ");
        setName(sc.nextLine());
        System.out.print("baseCost: ");
        setBaseCost(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        System.out.println("id: " + getId() + ", name: " + getName() + ", baseCost: " + getBaseCost());
    }
}
