package com.quantum.bookstore;

public class Main {
    public static void main(String[] args) {
        BookInventory inventory = new BookInventory();

        inventory.addBook(new PaperBook("PB1", "Clean Code", 2008, 300, "Mohamed", 10));
        inventory.addBook(new EBook("DP1", "Design Pattern", 2017, 250, "Shebita", "PDF"));
        inventory.addBook(new ShowcaseBook("SD1", "System Design", 2010, 0, "Tamer"));
        inventory.removeOutdatedBooks(10);
        double paid = inventory.buyBook("PB1", 2, "mohamedtamershebita@gmail.com", "Cairo, Egypt");
        System.out.println("Quantum book store: Paid amount = " + paid);
        double paid2 = inventory.buyBook("DP1", 1, "mohamedtamershebita@gmail.com", "Giza, Egypt");
        System.out.println("Quantum book store: Paid amount = " + paid);
    }
}
