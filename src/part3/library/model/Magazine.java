package part3.library.model;

public class Magazine extends LibraryWork {
    private String name;

    public Magazine(int id, String title, int releaseYear, String name) {
        super(id, title, releaseYear);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
