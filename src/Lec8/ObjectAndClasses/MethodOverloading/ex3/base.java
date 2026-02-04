package Lec8.ObjectAndClasses.MethodOverloading.ex3;

public class base {
    public static void info(String name, int age){
        System.out.print("ten: "+name+" va tuoi: "+age);
    }
    public static void info(int age, String name){
        System.out.print("tuoi: "+age+" va ten: "+name);
    }
}
