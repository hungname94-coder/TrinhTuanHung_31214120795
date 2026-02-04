package Lec9.InheritanceAndPolymorphism.superr.method;

public class Husky extends Dog {

    void DisplayInformation() {
        super.DisplayPrice();
        System.out.println("Husky");
    }
}
