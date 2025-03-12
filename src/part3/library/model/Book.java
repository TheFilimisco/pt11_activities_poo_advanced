package part3.library.model;

public class Book extends LibraryWork implements IManagerLibrary{
    private boolean hisLend;

    public Book(int id, String title, int releaseYear) {
        super(id, title, releaseYear);
        hisLend = false;
    }

    public boolean isHisLend() {
        return hisLend;
    }

    public void setHisLend(boolean hisLend) {
        this.hisLend = hisLend;
    }

    @Override
    public boolean lend() {
        return hisLend = true;
    }

    @Override
    public boolean unLend() {
        return hisLend = false;
    }

    @Override
    public void getValueLend() {
        System.out.println("The book is: " + hisLend);
    }

    @Override
    public String toString() {
        return "Book{" +
                "hisLend=" + hisLend +
                "} " + super.toString();
    }
}
