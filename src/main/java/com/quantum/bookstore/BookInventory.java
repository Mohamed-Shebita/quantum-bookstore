package com.quantum.bookstore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookInventory {
    private final List<Book> inventory = new ArrayList<>();
    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Quantum book store:"+ book.getTitle()+" Book has been added" );
    }

    public void removeOutdatedBooks(int maxAge) {
        int currentYear = java.time.LocalDate.now().getYear();
        Iterator<Book> iterator = inventory.iterator();

        while (iterator.hasNext()) {
            Book b = iterator.next();
            if ((currentYear - b.getYear()) > maxAge) {
                iterator.remove();
                System.out.println("Quantum book store: Removed outdated book " + b.getTitle());
            }
        }
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isPurchasable()) {
                    throw new RuntimeException("Quantum book store: Book isn't for sale");
                }
                double total = book.getPrice() * quantity;
                if (book instanceof PaperBook) {
                    PaperBook p = (PaperBook) book;
                    if (quantity > p.getStock()) {
                        throw new RuntimeException("Quantum book store: Not enough stock");
                    }
                    p.reduceStock(quantity);
                    ShippingService.ship(address);
                } else if (book instanceof EBook) {
                    MailService.send(email);
                }
                System.out.print("Quantum book store: Book purchased" + book.getTitle());
                return total;
            }
        }
        throw new RuntimeException("Quantum book store: Book not found");
    }
}
