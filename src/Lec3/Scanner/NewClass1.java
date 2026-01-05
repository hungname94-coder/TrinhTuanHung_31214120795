package Lec3.Scanner;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String[] args) {
        Scanner chu = new Scanner(System.in);
        System.out.print("nhap ho ten: ");
        String ht = chu.nextLine();
        
        Scanner id = new Scanner(System.in);
        System.out.print("nhap id: ");
        int mssv = id.nextInt();
        
        Scanner diachi = new Scanner(System.in);
        System.out.print("nhap dia chi: ");
        String dc = diachi.nextLine();
        
        Scanner diem = new Scanner(System.in);
        System.out.print("nhap diem: ");
        float gpa = diem.nextFloat();
        
        Scanner major = new Scanner(System.in);
        System.out.print("nhap nganh hoc: ");
        String cn = major.nextLine();
        
        Scanner hocbong = new Scanner(System.in);
        System.out.print("nhap hoc bong: ");
        boolean hb = hocbong.nextBoolean();
        
        System.out.println("Ho va ten: "+ht);
        System.out.println("ma so sinh vien: "+mssv);
        System.out.println("diachi: "+dc);
        System.out.println("diem: "+gpa);
        System.out.println("nganh hoc: "+cn);
        System.out.println("hoc bong: "+hb);
    }

}