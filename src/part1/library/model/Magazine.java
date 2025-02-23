package part1.library.model;

public class Magazine extends BookCard {
    private short year;
    private short numberMagazine;

    public Magazine(String title, String reference, short year, short numberMagazine) {
        super(title, reference);
        this.year = year;
        this.numberMagazine = numberMagazine;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getNumberMagazine() {
        return numberMagazine;
    }

    public void setNumberMagazine(short numberMagazine) {
        this.numberMagazine = numberMagazine;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "year=" + year +
                ", numberMagazine=" + numberMagazine +
                "} " + super.toString();
    }
}
