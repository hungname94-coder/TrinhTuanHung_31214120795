package Lec11.Encapsulation.Static;

public class Person {

    private String name;
    private static int count = 0;

    public Person(String n) {
        name = n;
        count++;
        System.out.println(count);

    }

    public static void main(String[] args) {
        Person p1 = new Person("Hung");
        Person p2 = new Person("Ngoc");

    }
}
