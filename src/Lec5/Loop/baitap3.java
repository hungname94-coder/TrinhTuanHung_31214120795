package Lec5.Loop;

import java.util.Scanner;

public class baitap3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap mssv: ");
        String mssv = scanner.nextLine();
        System.out.print("nhap ho va ten: ");
        String fullname = scanner.nextLine();
        System.out.print("nhap gpa: ");
        float gpa = scanner.nextFloat();
        System.out.println();
        System.out.println("ho va ten: " + fullname);
        System.out.println("ma so sinh vien: " + mssv);
        System.out.println("diem gpa: " + gpa);
    }
}
