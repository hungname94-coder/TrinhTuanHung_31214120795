package E_Vehicle;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleList vehicleList = new VehicleList();
        int next = 1;
        do {
            System.out.println("0. thoat. ");
            System.out.println("1. them xe hoi. ");
            System.out.println("2. them xe tai. ");
            System.out.println("3. cap nhat xe. ");
            System.out.println("4. tim xe. ");
            System.out.println("5. xoa xe. ");
            System.out.println("6. hien thi xe. ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("thoat");
                    break;
                case 1:
                    scanner.nextLine();
                    System.out.print("nhap xe hoi: ");
                    Car a = new Car();
                    a.addVehicle();
                    vehicleList.addVehicle(a);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("nhap xe tai: ");
                    Truck b = new Truck();
                    b.addVehicle();
                    vehicleList.addVehicle(b);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("nhap id: ");
                    vehicleList.updateVehicle(scanner.nextLine());
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("nhap id ");
                    vehicleList.findVehicleById(scanner.nextLine());
                case 5:
                    scanner.nextLine();
                    System.out.print("nhap id ");
                    vehicleList.deleteVehicle(scanner.nextLine());
                case 6:
                    System.out.print("tat ca xe: ");
                    vehicleList.displayAllVehicle();
                default:
            }
            if (choice == 0) {
                break;
            }
            System.out.println("tiep tuc? 1 co / 0 khong: ");
            next = scanner.nextInt();
        } while (next != 0);
    }
}
