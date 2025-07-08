package com.quantum.bookstore;

public class EBook extends Book {
    private final String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType)
    {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }
    public String getFileType()
    {
        return fileType;
    }
    @Override
    public boolean isPurchasable() {
        return true;
    }
}
