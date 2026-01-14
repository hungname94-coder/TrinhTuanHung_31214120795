package Lec5.Loop;

import java.util.*;
import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = random.nextInt(100) + 1;
        System.out.print("nhap so nguyen: ");
        int n = scanner.nextInt();
        if (n >= 1 || n <= 100) {
            while (n != a) {
                if (n < a) {
                    System.out.println("nhap so nguyen lon hon: ");
                    n = scanner.nextInt();
                } else if (n > a) {
                    System.out.println("be hon");
                    System.out.println("nhap so nguyen be hon: ");
                    n = scanner.nextInt();
                }
            }
            System.out.print("thanh cong!");
        }
    }
}
