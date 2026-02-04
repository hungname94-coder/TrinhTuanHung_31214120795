package Lec6.Array;

import java.util.Scanner;
import java.util.Arrays;

public class bt1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang: ");
        int m = scanner.nextInt();
        int[] mang = new int[m];
        System.out.println("nhap gia tri mang: ");
        for (int i = 0; i < m; i++) {
            System.out.print("gia tri thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
//a
        System.out.print("mang co gia tri: ");
        for (int i = 0; i < m; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
//b
        System.out.print("mang dao nguoc: ");
        for (int i = 0; i < mang.length / 2; i++) {
            int a = mang[i];
            mang[i] = mang[mang.length - 1 - i];
            mang[mang.length - 1 - i] = a;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
//c
        System.out.print("cac so chan trong mang: ");
        for (int i = 0; i < m; i++) {
            if (mang[i] % 2 == 0) {
                System.out.print(mang[i] + " ");
            }
        }
        System.out.println();
//d
        int tong = 0;
        System.out.print("cac so chia het 3 va 5: ");
        for (int i = 0; i < m; i++) {
            if (mang[i] % 3 == 0 && mang[i] % 5 == 0) {
                tong += mang[i];
            }
        }
        System.out.print("tong cac so chia het cho 3 va 5: "+tong);
//e
        Arrays.sort(mang);
        System.out.println();
        System.out.print("mang tang dan: ");
        for (int i = 0; i < m; i++) {
            System.out.print(mang[i] + " ");
        }
//f
        for (int i = 0; i < mang.length / 2; i++) {
            int a = mang[i];
            mang[i] = mang[mang.length - 1 - i];
            mang[mang.length - 1 - i] = a;
        }
        System.out.println();
        System.out.print("mang giam dan: ");
        for (int i = 0; i < m; i++) {
            System.out.print(mang[i] + " ");
        }
    }
}
