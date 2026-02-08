package Exercise1;

import java.util.ArrayList;

public class BookList {

    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        book.addBook();
        bookList.add(book);
        System.out.print("them vao");
    }

    public void updateBook(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                book.updateBook(id);
                return;
            }
        }
        System.out.println("khong tim thay id: " + id);
    }

    public void deleteBookById(String id) {
        for (Book object : bookList) {
            if (id.equals(object.getBookId())) {
                bookList.remove(object);
                System.out.print("xoa id: " + id);
            } else {
                System.out.println("khong tim thay id: " + id);
            }
        }
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        System.out.println("khong tim thay id: " + id);
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("khong co sach nao");
        } else {
            for (Book book : bookList) {
                book.displayBook();
            }
        }
    }
}
