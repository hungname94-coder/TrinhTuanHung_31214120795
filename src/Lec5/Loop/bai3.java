package Lec5.Loop;

import java.util.*;

public class bai3 {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(80 - 3 + 1) + 3;
        if (n % 2 == 0) {
            System.out.print(n + " la so chan");
        } else {
            System.out.print(n + " la so le");
        }
    }
}
