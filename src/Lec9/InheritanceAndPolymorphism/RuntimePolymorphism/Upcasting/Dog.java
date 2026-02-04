package Lec9.InheritanceAndPolymorphism.RuntimePolymorphism.Upcasting;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Barks Barks");
    }
}
