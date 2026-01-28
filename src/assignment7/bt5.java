package assignment7;

import java.util.Scanner;

public class bt5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sd = 0;
        System.out.print("nhap: ");
        String n = scanner.nextLine();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'a' || n.charAt(i) == 'u' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o') {
                sd++;
            }
        }
        System.out.println("co "+sd+" nguyen am");
    }
}