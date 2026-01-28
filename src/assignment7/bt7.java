package assignment7;

import java.util.Scanner;

public class bt7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String n = scanner.nextLine();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1' || n.charAt(i) == '2' || n.charAt(i) == '3' || n.charAt(i) == '4' || n.charAt(i) == '5' || n.charAt(i) == '6' || n.charAt(i) == '7' || n.charAt(i) == '8' || n.charAt(i) == '9' || n.charAt(i) == '0') {
                System.out.print(n.charAt(i));
            }
        }
    }
}
