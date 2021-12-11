package by.bsuir.Mukhliada.task15.util;

import by.bsuir.Mukhliada.task12.util.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {
        int priceBook1 = book1.getPrice();
        int priceBook2 = book2.getPrice();

        if (priceBook1 < priceBook2) {
            return -1;
        } else if (priceBook1 == priceBook2) {
            return 0;
        } else {
            return 1;
        }
    }
}
