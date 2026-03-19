package E_Person;

import java.util.Scanner;

public class Student extends Person {

    Scanner scanner = new Scanner(System.in);
    private double gpa;
    private double tuitionFee;

    public Student() {
    }

    public Student(double gpa, double tuitionFee) {
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("gpa: " + getGpa());
        System.out.println("hoc phi: " + getTuitionFee());
    }

    @Override
    public void addPerson() {
        super.addPerson();
        System.out.print("nhap gpa: ");
        setGpa(scanner.nextDouble());
        System.out.print("nhap hoc phi: ");
        setTuitionFee(scanner.nextDouble());
    }

    @Override
    public void updatePerson() {
        super.updatePerson();
        System.out.print("nhap gpa: ");
        setGpa(scanner.nextDouble());
        System.out.print("nhap hoc phi: ");
        setTuitionFee(scanner.nextDouble());
    }
    }
