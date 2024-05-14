// BuyDataLayer.java

public class BuyDataLayer {
    public class Book{
        
import java.util.Scanner;

public class Book {
    private String category;
    private double price;

    public Book(String category, double price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("Fiction", 15.99),
            new Book("Science Fiction", 12.50),
            new Book("Mystery", 18.75),
            new Book("Thriller", 14.25),
            new Book("Romance", 10.99)
        };

        
        Book book = getBookByName(books, inputBookName);
        if (book != null) {
            System.out.println("The price for the book '" + inputBookName + "' is: $" + book.getPrice());
        } else {
            System.out.println("Book not found.");
        }
    }

    public static Book getBookByName(Book[] books, String bookName) {
        for (Book book : books) {
            if (book.getCategory().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null; // If book is not found
    }
}

    // Dummy implementation for demonstration purposes
    public void processPayment(double amount) {
        // Perform payment processing logic here
        System.out.println("Payment processed successfully: $" + amount);
    }
}
