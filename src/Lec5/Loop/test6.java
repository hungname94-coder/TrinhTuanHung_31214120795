package Lec5.Loop;

import java.util.Scanner;

public class test6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n;
        do {
            System.out.print("nhap mat khau: ");
            n = scanner.nextLine();
        } while (!n.equals("duytan"));
        System.out.print("mat khau dung");
    }
}