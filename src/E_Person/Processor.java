package E_Person;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
        TeacherList teacherList = new TeacherList();
        int next = 1;
        do {
            System.out.println("0. thoat. ");
            System.out.println("1. them hoc sinh. ");
            System.out.println("2. them giao vien");
            System.out.println("3. cap nhat nguoi. ");
            System.out.println("4. xoa nguoi bang id. ");
            System.out.println("5. tim nguoi bang id.");
            System.out.println("6. hien thi tat ca.");
            System.out.println("7. highest.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("thoat");
                    break;
                case 1:
                    Student a = new Student();
                    a.addPerson();
                    personList.addPerson(a);
                    break;
                case 2:
                    Teacher b = new Teacher();
                    b.addPerson();
                    personList.addPerson(b);
                    teacherList.addTeacher(b);
                    break;
                case 3:
                    System.out.print("nhap id: ");
                    personList.updatePerson(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("nhap id: ");
                    personList.deletePersonById(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("nhap id");
                    personList.updatePerson(scanner.nextLine());
                    break;
                case 6:
                    System.out.print("tat ca: ");
                    personList.displayAll();
                    break;
//                case 7:
//                    System.out.print("highest: ");
//                    teacherList.highest();
//                    break;
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
