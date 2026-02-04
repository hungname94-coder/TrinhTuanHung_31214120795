package Lec5.Loop;

import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        int tong = 0;
        while (n != 0) {
            tong += n;
            System.out.print("nhap n ( =0 de thoat): ");
            n = scanner.nextInt();
        }
        System.out.print("tong = " + tong);
    }

}
