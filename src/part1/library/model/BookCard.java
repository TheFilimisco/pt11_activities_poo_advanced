package part1.library.model;

import java.util.Objects;

public class BookCard {
    protected String title;
    protected String reference;

    public BookCard(String title, String reference) {
        this.title = title;
        this.reference = reference;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookCard bookCard)) return false;
        return Objects.equals(reference, bookCard.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reference);
    }

    @Override
    public String toString() {
        return "BookCard{" +
                "title='" + title + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
