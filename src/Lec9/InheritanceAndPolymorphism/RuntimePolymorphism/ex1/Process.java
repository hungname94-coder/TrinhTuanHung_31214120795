package Lec9.InheritanceAndPolymorphism.RuntimePolymorphism.ex1;

public class Process {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}
