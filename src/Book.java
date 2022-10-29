import java.util.Objects;

public class Book {
    private String name;
    private int yearOfPublication;
    private String author;

    public Book(String name, int yearOfPublication, String author) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return "Название книги - " + this.name + " Год издания - " + this.yearOfPublication + " Автор книги - " +
                this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfPublication, author);
    }
}



