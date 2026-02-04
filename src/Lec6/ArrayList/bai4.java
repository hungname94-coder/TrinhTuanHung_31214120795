package Lec6.ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class bai4 {

    public static void A(int n, ArrayList<Integer> so) {
        for (int i = 0; i < so.size(); i++) {
            System.out.print(so.get(i) + " ");
        }
        System.out.println();
    }

    public static void B(int n, ArrayList<Integer> so) {
        int sd = 0;
        for (int i = 0; i < so.size(); i++) {
            if (so.get(i) % 2 == 0) {
                System.out.println(so.get(i) + " nam o vi tri " + i);
                sd++;
            }
        }
        System.out.println("co " + sd + " so chan");
    }

    public static void C(int n, ArrayList<Integer> so) {
        int tong = 0;
        for (int i = 0; i < so.size(); i++) {
            tong += so.get(i);
        }
        System.out.println("tong = " + tong);
    }

    public static void D(int n, ArrayList<Integer> so) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri: ");
        so.remove(scanner.nextInt());
        for (int i = 0; i < so.size(); i++) {
            System.out.print(so.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> so = new ArrayList<>();
        System.out.print("nhap kich thuoc: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so nguyen thu " + (i) + ": ");
            so.add(scanner.nextInt());
        }
        A(n,so);
        B(n,so);
        C(n,so);
        D(n,so);
    }
}
