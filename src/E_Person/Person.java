package E_Person;

import java.util.Scanner;

public abstract class Person implements IPerson {

    Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private int yearOfBirth;

    public Person() {
    }

    public Person(String id, String name, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public void displayDetails() {
        System.out.println("id: " + getId());
        System.out.println("ten: " + getName());
        System.out.println("nam sinh: " + getYearOfBirth());
    }

    @Override
    public void addPerson() {
        System.out.print("nhap id: ");
        setId(sc.nextLine());
        System.out.print("nhap ten: ");
        setName(sc.nextLine());
        System.out.print("nhap nam sinh: ");
        setYearOfBirth(sc.nextInt());
    }

    @Override
    public void updatePerson() {
        System.out.print("nhap ten: ");
        setName(sc.nextLine());
        System.out.print("nhap nam sinh: ");
        setYearOfBirth(sc.nextInt());
    }
}
