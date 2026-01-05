package Lec3.Scanner;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so nguyen: ");
        int n = scanner.nextInt();
        System.out.println("so nguyen: " + n);

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a multi-word sentence : ");
        String a = keyboard.nextLine();
        System.out.println(a);
        System.out.print("Enter a one word string : ");
        String b = keyboard.next();
        System.out.println(b);

        Scanner bool = new Scanner(System.in);
        System.out.print("Enter a boolean: ");
        boolean c = bool.nextBoolean();
        System.out.println(c);
    }
}
