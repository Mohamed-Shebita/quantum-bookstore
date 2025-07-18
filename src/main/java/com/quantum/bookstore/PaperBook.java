package com.quantum.bookstore;

public class PaperBook extends Book
{
    private int stock;
    public PaperBook(String isbn, String title, int year, double price, String author, int stock)
    {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }
    public int getStock()
    {
        return stock;
    }
    public void reduceStock(int amount) {
        if (amount > stock)
            throw new IllegalArgumentException("Not enough");
            stock -= amount;
    }
    @Override
    public boolean isPurchasable()
    {
        return true;
    }
}
