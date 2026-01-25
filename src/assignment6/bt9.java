package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class bt9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> minmax = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("nhap so thu " + i + ": ");
            minmax.add(scanner.nextInt());
        }
        int min = minmax.get(0);
        int max = minmax.get(0);
        for (int i = 0; i < minmax.size(); i++) {
            if (max > minmax.get(i)) {
                max = minmax.get(i);
            }
            if (min < minmax.get(i)) {
                min = minmax.get(i);
            }
        }
        System.out.println("so lon nhat: " + max);
        System.out.println("so be nhat: " + min);
    }
}
