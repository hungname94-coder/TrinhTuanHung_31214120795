package E_Person;

import java.util.Scanner;

public class Teacher extends Person {

    Scanner scanner = new Scanner(System.in);
    private int numberOfClasses;
    private double baseSalary;

    public Teacher() {
    }

    public Teacher(String id, String name, int yearOfBirth) {
        super(id, name, yearOfBirth);
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("so luong lop: " + getNumberOfClasses());
        System.out.println("luong cung: " + getBaseSalary());
    }

    @Override
    public void addPerson() {
        System.out.print("nhap so luong lop: ");
        setNumberOfClasses(scanner.nextInt());
        System.out.print("nhap luong cung: ");
        setBaseSalary(scanner.nextDouble());
    }

    @Override
    public void updatePerson() {
        super.updatePerson();
        System.out.print("nhap so luong lop: ");
        setNumberOfClasses(scanner.nextInt());
        System.out.print("nhap luong cung: ");
        setBaseSalary(scanner.nextDouble());
    }
}
