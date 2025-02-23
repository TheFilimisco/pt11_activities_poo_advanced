package part1.library.test;

import part1.library.model.BookCard;
import part1.library.model.Magazine;
import part1.library.model.Volume;
import part1.library.model.Work;

public class TestBookCard {
    public static void main(String[] args) {

        //BookCard
        BookCard bookCard = new BookCard("Imaginary Friend", "XX0");
        BookCard bookCard1 = new BookCard("It", "XX1");
        BookCard bookCard2 = new BookCard("Carrie","XX2");
        BookCard bookCard3 = new BookCard("Carrie","XX2");
        System.out.println(bookCard);
        System.out.println(bookCard1);
        System.out.println(bookCard2);
        System.out.println(bookCard3);

        //Work
        Work work1 = new Work("Imaginary Friend", "XX0","Stephen Chbosky", (short) 200);
        Work work2 = new Work("It", "XX1","Stephen King", (short) 290);
        System.out.println(work1);
        System.out.println(work2);

        //Volume
        Volume volume = new Volume("Imaginary Friend", "XX0", "Stephen Chbosky", (short)290, (short)1);
        Volume volume1 = new Volume("It", "XX1", "Stephen King", (short)300, (short)1);
        System.out.println(volume);
        System.out.println(volume1);

        //Magazine
        Magazine magazine = new Magazine("New Biology","MM0",(short) 2019,(short) 1);
        Magazine magazine1 = new Magazine("Big Bang Theory","MM1",(short) 2000,(short) 2);
        System.out.println(magazine);
        System.out.println(magazine1);






    }
}
