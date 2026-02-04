package Lec8.ObjectAndClasses.excar;

public class test1 {
    private String model;
    private int year;
    public test1(String model, int year){
        this.model=model;
        this.year=year;
    }
    public void display(){
        System.out.print("model: "+model+" year: "+year);
    }
}