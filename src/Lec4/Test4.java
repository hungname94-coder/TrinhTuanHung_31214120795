package Lec4;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.print("n = 1");
                break;
            case 2:
                System.out.print("n = 2");
                break;
            case 3:
                System.out.print("n = 3");
                break;
            case 4:
                System.out.print("n = 4");
                break;
            case 5:
                System.out.print("n = 5");
                break;
            default:
                System.out.print("ko ton tai");
        }
    }
}
