package Room;

import java.util.Scanner;

public class MeetingRoom extends Room {

    Scanner scanner = new Scanner(System.in);
    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.print("capacity: ");
        setCapacity(scanner.nextInt());
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.print("capacity: ");
        setCapacity(scanner.nextInt());
    }

    @Override
    public void displayDetails() {
        displayDetails();
        System.out.println(", capacity: " + getCapacity());
    }
}
