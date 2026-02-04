package Lec8.ObjectAndClasses.constructor.ex1;

public class Student {

    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(3892, "hung");
        Student s2 = new Student(9292, "Ngoc");
        s1.display();
        s2.display();
    }
}
