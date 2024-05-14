// BuyBusinessLayer.java

public class BuyBusinessLayer {
    private BuyDataLayer dataLayer;

    public BuyBusinessLayer() {
        this.dataLayer = new BuyDataLayer();
    }

    /**
     * Processes the payment for the specified amount.
     *
     * @param amount The amount to be paid
     */
    public void processPayment(double price , String name) {
       Book book = getBookByName(books, inputBookName);
        if (book != null) {
            System.out.println("The price for the book '" + inputBookName + "' is: $" + book.getPrice());
        } else {
            System.out.println("Book not found.");
        }

        // Call the data layer to process the payment
        dataLayer.processPayment(price);
    }
}
