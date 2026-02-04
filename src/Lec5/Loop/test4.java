package Lec5.Loop;

import java.util.Scanner;

public class test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        while (n <= 200) {
            System.out.print(n + " ");
            n = n * 2;
        }
    }
}
