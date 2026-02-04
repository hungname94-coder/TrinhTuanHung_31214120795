package Lec9.InheritanceAndPolymorphism.RuntimePolymorphism.Upcasting;

public class Process {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        for (int i = 0; i < 3; i++) {
            animals[i].makeSound();
        }
    }
}
