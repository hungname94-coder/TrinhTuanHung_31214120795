package Lec4;

import java.util.Scanner;

public class test3 {

    public static double quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap diem x: ");
        double x = scanner.nextDouble();
        System.out.print("nhap diem y: ");
        double y = scanner.nextDouble();
        System.out.print(quadrant(x, y));
    }
}
