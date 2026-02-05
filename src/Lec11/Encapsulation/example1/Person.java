package Lec11.Encapsulation.example1;

public class Person {

    public String name;
    private double weight;

    public void setWeight(double weight) {
        if (this.weight < 0) {
            System.out.println("vo ly!!");
        } else {
            this.weight = weight;
        }
    }
}
