package part3.library.model;

public class LibraryWork {
    private int id;
    private String title;
    private int releaseYear;

    protected LibraryWork(int id, String title, int releaseYear) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected int getReleaseYear() {
        return releaseYear;
    }

    protected void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void informationPublishment(){
        System.out.println("Information publishment: " + releaseYear);
    }
    public void informationId(){
        System.out.println("Information Id: " + id);
    }

    @Override
    public String toString() {
        return "LibraryWork{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
