package Lec6.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("nhap ten: ");
            name.add(scanner.nextLine());
        }
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
    }
}
