package Lec5.Loop;

import java.util.*;
import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n tu 1 toi 100: ");
        int n = scanner.nextInt();
        while (n <= 1 || n >= 100) {
            System.out.print("nhap so tu 1 toi 100: ");
             n = scanner.nextInt();
        }
        double m = random.nextDouble() * 99 + 1;
        if (n < m) {
            System.out.print(n + " be hon " + m);
        } else if (n > m) {
            System.out.print(n + " lon hon " + m);
        } else {
            System.out.print(n + " bang " + m);
        }
    }
}
