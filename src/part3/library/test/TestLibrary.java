package part3.library.test;

import part3.library.model.Book;
import part3.library.model.LibraryWork;
import part3.library.model.Magazine;

import java.util.ArrayList;
import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {

        Book book = new Book(1,"XD",2019);
        Magazine magazine = new Magazine(2,"XD",2019,"New XD");

        System.out.println(book);
        book.informationId();
        book.informationPublishment();
        System.out.println(book.lend());
        System.out.println(book);
        System.out.println(book.unLend());
        System.out.println(book);
        book.getValueLend();

        System.out.println(magazine);
        magazine.informationId();
        magazine.informationPublishment();

    }
}
