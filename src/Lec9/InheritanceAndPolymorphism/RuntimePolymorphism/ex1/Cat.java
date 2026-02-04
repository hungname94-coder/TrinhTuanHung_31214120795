package Lec9.InheritanceAndPolymorphism.RuntimePolymorphism.ex1;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meows meows");
    }
}
