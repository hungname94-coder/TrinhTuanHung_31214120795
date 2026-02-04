package Lec6.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> so = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            System.out.print("nhap so thuc: ");
            so.add(scanner.nextDouble());
        }
        for (int i = 0; i < so.size(); i++) {
            System.out.println(so.get(i));
        }
    }
}
