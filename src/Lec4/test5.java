package Lec4;

import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = scanner.nextInt();
        System.out.print("nhap b: ");
        int b = scanner.nextInt();
        Scanner kitu = new Scanner(System.in);
        System.out.print("nhap phep tinh: ");
        char c = kitu.next().charAt(0);
        switch (c) {
            case '+' ->
                System.out.print("a + b = " + (a + b));
            case '-' ->
                System.out.print("a - b = " + (a - b));
            case '*' ->
                System.out.print("a * b = " + (a * b));
            case '/' ->
                System.out.print("a / b = " + (a / b));
            default ->
                System.out.print("nhap + - * /");
        }
    }
}
