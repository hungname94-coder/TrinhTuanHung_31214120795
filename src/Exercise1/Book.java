package Exercise1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook {

    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private int quantity;

    public Book() {
    }

    public Book(String bookId, String publisher, Date entryDate, double unitPrice, int quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addBook() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap book id: ");
            setBookId(sc.nextLine());
            System.out.print("nhap nha san xuat: ");
            setPublisher(sc.nextLine());
            System.out.print("nhap gia: ");
            setUnitPrice(sc.nextDouble());
            System.out.print("nhap so luong: ");
            setQuantity(sc.nextInt());
            sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("nhap ngay: ");
            String entryDateString = sc.nextLine();
            setEntryDate(sdf.parse(entryDateString));
        } catch (ParseException e) {
            System.out.print(e);
        }
    }

    public void updateBook(String id) {
        if (this.bookId.equals(id)) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("nhap book id: ");
                setBookId(sc.nextLine());
                System.out.print("nhap nha san xuat: ");
                setPublisher(sc.nextLine());
                System.out.print("nhap gia: ");
                setUnitPrice(sc.nextDouble());
                System.out.print("nhap so luong: ");
                setQuantity(sc.nextInt());
                sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("nhap ngay: ");
                String entryDateString = sc.nextLine();
                setEntryDate(sdf.parse(entryDateString));
            } catch (ParseException e) {
                System.out.print(e);
            }
        }
    }
    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + getBookId() + ", nha san xuat: " + getPublisher() + ",ngay san xuat: " + sdf.format(entryDate) + ", gia: " + getUnitPrice() + ", so luong: " + getQuantity());
    }
}
