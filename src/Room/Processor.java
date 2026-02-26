package Room;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomList roomList = new RoomList();
        int next = 1;
        do {
            System.out.println("0. thoat. ");
            System.out.println("1. them phong. ");
            System.out.println("2. cap nhat phong. ");
            System.out.println("3. tim phong. ");
            System.out.println("4. xoa phong. ");
            System.out.println("5. hien thi phong. ");
            System.out.println("6. dem phong. ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("thoat");
                    break;
                case 1:
                    System.out.print("nhap phong hop (1) / phong ngu(2): ");
                    switch (scanner.nextInt()) {
                        case 1:
                            MeetingRoom a = new MeetingRoom();
                            a.addRoom();
                            roomList.addRoom(a);
                            break;
                        case 2:
                            BedRoom b = new BedRoom();
                            b.addRoom();
                            roomList.addRoom(b);
                            break;
                    }
                    System.out.println("thanh cong");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("nhap id: ");
                    roomList.updateRoom(scanner.nextLine());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("nhap id: ");
                    roomList.findRoomById(scanner.nextLine());
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("nhap id ");
                    roomList.deleteRoom(scanner.nextLine());
                    break;
                case 5:
                    System.out.println("tat ca phong: ");
                    roomList.displayAllRooms();
                    break;
                case 6:
                    roomList.countRooms();
                    break;
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
