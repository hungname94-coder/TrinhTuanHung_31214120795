package assignment7;

import java.util.Scanner;

public class bt6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap: ");
        String n = scanner.nextLine();
        System.out.print("nhap tu can thay the: ");
        String a = scanner.nextLine();
        System.out.print("nhap tu thay the: ");
        String b = scanner.nextLine();
        String c = n.replace(a, b);
        System.out.println("ket qua: " + c);
    }
}
