package Lec5.Loop;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        int sd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sd++;
                System.out.print(i + " ");
            }
        }
        if (sd != 0) {
            System.out.println();
            System.out.println("co " + sd + " so chia het cho 3 va 5");
        } else {
            System.out.print("ko co so nao!");
        }
    }
}
