package Lec6.ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> so = new ArrayList<>();
        System.out.print("nhap so luong: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so nguyen: ");
            so.add(scanner.nextInt());
        }
        for (int i = 0; i < so.size(); i++) {
            if (so.get(i) % 2 != 0) {
                System.out.println(so.get(i));
            }
        }
    }
}
