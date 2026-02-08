package Exercise1;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super();
        this.tax = tax;
    }

    public ReferenceBook() {
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.print("nhap thue: ");
        setTax(scanner.nextDouble());
        System.out.println("them vao thanh cong ");
    }

    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.print("nhap thue: ");
            setTax(scanner.nextDouble());
            System.out.println("sua thanh cong");
        } else {
            System.out.println("hong tim thay id " + id);
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("thue: " + getTax());
    }
}
