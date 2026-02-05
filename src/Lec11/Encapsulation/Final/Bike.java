package Lec11.Encapsulation.Final;

public class Bike {

    final int Speed = 100;

    public void run() {
        int Speed = 200;
    }

    public static void main(String[] args) {
        Bike go = new Bike();
        go.run();
    }
}
