package Lec4;

import java.util.Scanner;

public class test2 {

    public static int findMaxNumber(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner nhapa = new Scanner(System.in);
        Scanner nhapb = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = nhapa.nextInt();
        System.out.print("nhap b: ");
        int b = nhapb.nextInt();
        System.out.println("so lon hon la " + findMaxNumber(a, b));
    }
}
