package Lec5.Loop;

import java.util.Scanner;

public class baitap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.print("pt vo nghiem");
            } else {
                double n = -c / b;
                System.out.print("phuong trinh co nghiem la: " + n);
            }
        } else {
            double delta = (b * b) - (4 * a * c);
            System.out.println("delta  = " + delta);
            if (delta < 0) {
                System.out.print("vo nghiem");
            } else if (delta == 0) {
                double x = (-b) / 2 * a;
                System.out.print("phuong trinh co nghiem kep la: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.print("phuong trinh co 2 nghiem " + x1 + " va " + x2);
            }
        }
    }
}
