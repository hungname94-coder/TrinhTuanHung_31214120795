package Lec9.InheritanceAndPolymorphism.superr.instanceVariable;

public class Husky extends Dog{
    void display(){
    int price=1500;
    System.out.println("Dog: "+super.price);
    System.out.println("Husky: "+price);
}}
