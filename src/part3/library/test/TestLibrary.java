package part3.library.test;

import part3.library.model.Book;
import part3.library.model.LibraryWork;
import part3.library.model.Magazine;

import java.util.ArrayList;
import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {

        Book book = new Book(1,"Alice's Adventures in Wonderland",2019);
        Magazine magazine = new Magazine(2,"science",2019,"The epidemic");

        // Method herency
        System.out.println(book);
        book.informationId();
        book.informationPublishment();

        //Method Interface
        System.out.println(book.lend());
        System.out.println(book);
        System.out.println(book.unLend());
        System.out.println(book);
        book.getValueLend();

        //Method herency
        System.out.println(magazine);
        magazine.informationId();
        magazine.informationPublishment();

    }
}
