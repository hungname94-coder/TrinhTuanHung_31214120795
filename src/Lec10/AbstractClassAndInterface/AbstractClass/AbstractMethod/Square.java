package Lec10.AbstractClassAndInterface.AbstractClass.AbstractMethod;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}