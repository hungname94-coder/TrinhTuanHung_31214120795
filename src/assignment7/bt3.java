package assignment7;

import java.util.Scanner;

public class bt3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap: ");
        String n = scanner.nextLine();
        String nguoc = new StringBuilder(n).reverse().toString();
        System.out.print("chuoi nguoc: " + nguoc);
    }
}
