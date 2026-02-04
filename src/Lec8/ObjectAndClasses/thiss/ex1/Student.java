package Lec8.ObjectAndClasses.thiss.ex1;

public class Student {

    int id;
    String name;

    Student() {
        System.out.println("abc");
    }

    Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(3892, "hung");
        Student s2 = new Student(9292, "Ngoc");
        Student s3 = new Student(9284, "hungne");
        s1.display();
        s2.display();
        s3.display();
    }
}
