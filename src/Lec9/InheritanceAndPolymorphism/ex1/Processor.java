package Lec9.InheritanceAndPolymorphism.ex1;

public class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println(cat.catid);
        cat.catchMouse();
    }
}
