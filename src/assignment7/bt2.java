package assignment7;

import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chu: ");
        String n = scanner.nextLine().trim();
        String[] words = n.split("\\s+");
        System.out.println("so tu = " + words.length);
    }
}
