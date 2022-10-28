import java.util.Objects;

public class Book {
    private String name;
    private int yearOfPublication;

    public Book(String name, int yearOfPublication) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Название книги - " + this.name + " Год издания - " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfPublication);
    }
}


