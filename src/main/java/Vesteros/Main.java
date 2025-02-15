package Vesteros;

import org.hogwards.Map.Faculte;
import org.hogwards.Map.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<Book, String> library = new HashMap<>();

    public static void main(String[] args) {
        Book dorn = new Book("Dorn", "David Stark", 1234);
        Book nord = new Book("Nord", "David Stark", 1225);
        Book nordIsland = new Book("NordIsland", "Tom West", 1234);
        Book houseStarc = new Book("House Starc", "Tom West", 1225);
        Book houseStarcNew = new Book("House Starc", "David Stark", 1241);
        Book empireOfTheStormKings = new Book("Empire of the Storm Kings", "Olivia Nord", 1241);

        library.put(dorn, "One");
        library.put(nord, "Too");
        library.put(nordIsland, "Three");
        library.put(houseStarc, "Foгr");
        library.put(houseStarcNew, "Five");
        library.put(empireOfTheStormKings, "Second");

        adBookToLibrary(new Book("Ambers", "Olivia Nord", 1225), "Six");
        removeBooKFromLibrary(houseStarcNew);
        printBookFromLibrary();
        findBookFromLibrary(dorn);

    }

    private static void adBookToLibrary(Book book, String shelf) {
        library.put(book, shelf);
    }

    private static void removeBooKFromLibrary(Book book) {
        library.remove(book);
    }

    private static void findBookFromLibrary(Book book) {
        System.out.println("Book place " + book.getTitle() +" "+library.get(book));
    }

    private static void printBookFromLibrary() {
        for (Map.Entry<Book, String> entry : library.entrySet()) {
//            String key = entry.getKey().getTitle() + entry.getKey().getAuthor() + entry.getKey().getYear();
            String key = entry.getKey().toString();
            String value = entry.getValue();
            System.out.println("Book: " + key + ", Shelf: " + value);
        }
    }
}
