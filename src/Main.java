import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //Домашняя работа
        System.out.println("Домашняя работа");

        Book grokAlgorithms = new Book("GrokAlgorithms", 2017, new Author("Аditya", "Bhargava"));
        System.out.println("grokAlgorithms.name = " + grokAlgorithms.getName());
        System.out.println("grokAlgorithms.yearOfPublication = " + grokAlgorithms.getYearOfPublication());
        grokAlgorithms.setYearOfPublication(2019);
        System.out.println("grokAlgorithms.getYearOfPublication() = " + grokAlgorithms.getYearOfPublication());
        Author aditya = new Author("Аditya", "Bhargava");
        System.out.println("aditya.name = " + aditya.getName());
        Author bhargava = new Author("Аditya", "Bhargava");
        System.out.println("bhargava.surname = " + bhargava.getSurname());
        System.out.println();
        //Домашняя работа
        System.out.println("Домашняя работа");
        System.out.println(grokAlgorithms);
        System.out.println(aditya);
    }
}