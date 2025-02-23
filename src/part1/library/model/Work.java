package part1.library.model;

public class Work extends BookCard {
    protected String author;
    protected short numberPages;

    public Work(String title, String reference, String author, short numberPages) {
        super(title, reference);
        this.author = author;
        this.numberPages = numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public short getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(short numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Work{" +
                "author='" + author + '\'' +
                ", numberPages=" + numberPages +
                "} " + super.toString();
    }
}
