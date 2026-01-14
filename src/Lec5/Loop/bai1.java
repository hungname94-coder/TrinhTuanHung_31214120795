package Lec5.Loop;

import java.util.*;

public class bai1 {
    
    public static void main(String[] args) {
        Random random = new Random();
        int tong = 0;
        int sd = 0;
        while (tong != 7) {
            int n = random.nextInt(6) + 1;
            int m = random.nextInt(6) + 1;
            tong = n + m;
            sd++;
            System.out.println(n + " + " + m + " = " + tong);
        }
        System.out.print("ban da thang sau " + sd + " lan thu");
    }
}
