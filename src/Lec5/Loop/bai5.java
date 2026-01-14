package Lec5.Loop;

import java.util.*;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sd = 1;
        int m = random.nextInt(10) + 1;
        System.out.print("nhap so nguyen tu 1-10: ");
        int n = scanner.nextInt();
        if (n >= 1 || n <= 10) {
            while (n != m) {
                System.out.println(n + " khac " + m);
                System.out.print("nhap so nguyen tu 1-10: ");
                n = scanner.nextInt();
                m = random.nextInt(10) + 1;
                sd++;
            }
            System.out.print(n + " giong " + m + " sau " + sd + " lan thu");
        }
    }
}
