package Lec6.Array;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so ngay: ");
        int n = scanner.nextInt();
        double tb = 0;
        int sd = 0;
        int[] day = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap ngay " + (i + 1)+": ");
            day[i] = scanner.nextInt();
            tb += day[i];
        }
        tb = tb / n;
        System.out.println("nhiet do trung binh: " + tb);
        for (int i = 0; i < n; i++) {
            if (day[i] > tb) {
                sd++;
            }
        }
        System.out.println("co " + sd + " ngay tren nhiet do trung binh");
    }
}
