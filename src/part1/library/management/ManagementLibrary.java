package part1.library.management;

import part1.library.model.BookCard;
import part1.library.model.Magazine;
import part1.library.model.Volume;
import part1.library.model.Work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ManagementLibrary {
    private List<BookCard> cards;
    private final int sizeCards;

    public ManagementLibrary(int sizeCards) {
        this.sizeCards = sizeCards;
        cards = new ArrayList<>();
    }

    private boolean isFully(){
        return cards.size() == sizeCards;
    }

    public int getSizeCardsFromLibrary() {
        return sizeCards;
    }

    public int getFileOnLibrary(){
        return cards.size();
    }

    public void addNewFile(BookCard file){
        if (cards.contains(file)){
            System.out.println("This File exist!");
            return;
        }
        if (!isFully()){
            cards.add(file);
            return;
        }
        System.out.println("The library is Fully");
    }

    public BookCard getFileByReference(String reference){
        return cards.stream()
                .filter( bookCard -> bookCard.getReference().equals(reference))
                .findFirst()
                .orElse(null);
    }

    public BookCard getFileByPosition(int numberPosition){
        return cards.stream()
                .skip(numberPosition)
                .findFirst()
                .get();
    }


    public void showAllFiles(){
        cards.forEach(System.out::println);
    }


    public static void main(String[] args) {
        //Initialize Capacity
        ManagementLibrary managementLibrary = new ManagementLibrary(10);

        //Add
        BookCard bookCard = new BookCard("Imaginary Friend", "XX0");
        BookCard bookCard1 = new BookCard("It", "XX1");
        BookCard bookCard2 = new BookCard("Carrie","XX2");
        BookCard bookCard3 = new BookCard("Carrie","XX2");
        Work work1 = new Work("Imaginary Friend", "XX0","Stephen Chbosky", (short) 200);
        Work work2 = new Work("It", "XX1","Stephen King", (short) 290);
        Volume volume = new Volume("Imaginary Friend", "XX0", "Stephen Chbosky", (short)290, (short)1);
        Volume volume1 = new Volume("It", "XX1", "Stephen King", (short)300, (short)1);
        Magazine magazine = new Magazine("New Biology","MM0",(short) 2019,(short) 1);
        Magazine magazine1 = new Magazine("Big Bang Theory","MM1",(short) 2000,(short) 2);

        managementLibrary.addNewFile(volume);
        managementLibrary.addNewFile(volume1);
        managementLibrary.addNewFile(magazine);
        managementLibrary.addNewFile(magazine1);
        managementLibrary.addNewFile(bookCard);
        managementLibrary.addNewFile(bookCard1);
        managementLibrary.addNewFile(bookCard2);
        managementLibrary.addNewFile(bookCard3);
        managementLibrary.addNewFile(work1);
        managementLibrary.addNewFile(work2);

        //Show All Files
        managementLibrary.showAllFiles();

        //Capacity Library
        System.out.println(managementLibrary.getSizeCardsFromLibrary());

        //Files on Library
        System.out.println(managementLibrary.getFileOnLibrary());

        //Get File by Reference
        System.out.println(managementLibrary.getFileByReference("XX0"));

        //Get File by Position
        System.out.println(managementLibrary.getFileByPosition(3));

    }
}
