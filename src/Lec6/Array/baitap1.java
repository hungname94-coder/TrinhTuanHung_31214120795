package Lec6.Array;

import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {

    public static void caua(int m, int mang[]) {
        System.out.print("mang co gia tri: ");
        for (int i = 0; i < m; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    public static void caub(int m, int mang[]) {
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
    }

    public static void cauc(int m, int mang[]) {
        System.out.print("cac so chan trong mang: ");
        for (int i = 0; i < m; i++) {
            if (mang[i] % 2 == 0) {
                System.out.print(mang[i] + " ");
            }
        }
        System.out.println();
    }

    public static void caud(int m, int mang[]) {
        int tong = 0;
        for (int i = 0; i < m; i++) {
            if (mang[i] % 3 == 0 && mang[i] % 5 == 0) {
                tong += mang[i];
            }
        }
        System.out.print("tong cac so chia het cho 3 va 5: " + tong);
    }

    public static void caue(int m, int mang[]) {
        Arrays.sort(mang);
        System.out.println();
        System.out.print("mang tang dan: ");
        for (int i = 0; i < m; i++) {
            System.out.print(mang[i] + " ");
        }
    }

    public static void cauf(int m, int mang[]) {
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
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang: ");
        int m = scanner.nextInt();
        int[] mang = new int[m];
        System.out.println("nhap gia tri mang: ");
        for (int i = 0; i < m; i++) {
            System.out.print("gia tri thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        caua(m,mang);
        caub(m,mang);
        cauc(m,mang);
        caud(m,mang);
        caue(m,mang);
        cauf(m,mang);
    }
}
