package Lec4;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = nhap.nextInt();
        if (n <= 100 && n >= 90) {
            System.out.println("You got an A");
        } else if (n >= 80) {
            System.out.println("You got a B");
        } else if (n >= 70) {
            System.out.println("You got a C");
        } else if (n >= 60) {
            System.out.println("You got a D");
        } else {
            System.out.println("You got an E");
        }
    }
}
