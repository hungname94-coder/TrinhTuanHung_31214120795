package Lec5.Loop;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n*n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}