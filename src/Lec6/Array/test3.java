package Lec6.Array;

import java.util.Scanner;
import java.util.Arrays;

public class test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so ngay: ");
        int n = scanner.nextInt();
        double tb = 0;
        int sd = 0;
        int[] day = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap ngay " + (i + 1) + ": ");
            day[i] = scanner.nextInt();
            tb += day[i];
        }
        tb = tb / n;
        System.out.printf("nhiet do trung binh = %.1f\n", tb);
        for (int i = 0; i < n; i++) {
            if (day[i] > tb) {
                sd++;
            }
        }
        System.out.println("co " + sd + " ngay tren nhiet do trung binh");
        System.out.print("nhiet do moi ngay: ");
        for (int i = 0; i < n; i++) {
            System.out.print(day[i] + " ");
        }
        Arrays.sort(day);
        System.out.println();
        System.out.println("2 ngay lanh nhat: " + day[0] + ", " + day[1]);
        System.out.println("2 ngay nong nhat: " + day[day.length - 1] + ", " + day[day.length - 2]);
    }
}
