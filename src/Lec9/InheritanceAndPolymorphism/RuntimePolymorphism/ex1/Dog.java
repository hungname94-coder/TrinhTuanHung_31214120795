package Lec9.InheritanceAndPolymorphism.RuntimePolymorphism.ex1;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Barks barks");
    }
}
