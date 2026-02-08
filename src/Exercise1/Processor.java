package Exercise1;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        while (true) {
            System.out.println("0. thoat" + "\n1. them sach moi" + "\n2. cap nhat sach bang id" + "\n3. xoa sach bang id" + "\n4. tim sach bang id" + "\n5. hien thi tat ca sach" + "\nchon: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("chon loai sach: \n1. sach giao khoa \n2. sach tham khao");
                    int bookType = scanner.nextInt();
                    scanner.nextLine();
                    if (bookType == 1) {
                        TextBook tb = new TextBook();
                        bookList.addBook(tb);
                    } else if (bookType == 2) {
                        ReferenceBook rb = new ReferenceBook();
                        bookList.addBook(rb);
                    } else {
                        System.out.println("khong hop le");
                    }
                    break;
                case 2:
                    System.out.print("nhap id sach de cap nhat: ");
                    String updateId = scanner.nextLine();
                    bookList.updateBook(updateId);
                    break;
                case 3:
                    System.out.print("nhap id sach de xoa: ");
                    String deleteId = scanner.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;
                case 4:
                    System.out.print("nhap id sach de tim: ");
                    String findId = scanner.nextLine();
                    Book foundBook = bookList.findBookById(findId);
                    if (foundBook != null) {
                        foundBook.displayBook();
                    }
                    break;
                case 5:
                    bookList.displayAllBooks();
                    break;
                case 0:
                    System.out.println("thoat");
                    scanner.close();
                    return;
                default:
                    System.out.println("chon ko hop le, vui long chon lai");
            }
        }
    }
}
