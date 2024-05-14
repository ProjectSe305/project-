// BuyPresentationLayer.java

import java.util.Scanner;

public class BuyPresentationLayer {
    private BuyBusinessLayer businessLayer;

    public BuyPresentationLayer() {
        this.businessLayer = new BuyBusinessLayer();
    }

    /**
     * Starts the buy process.
     */ 
    //add am more clear payment method like let customer mention the name on the catagory of the book and then you show the amount 
    public void startBuy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buy Page");
        System.out.println("--------");

        System.out.print("Enter the amount to be paid: $");
        double amount = scanner.nextDouble();

        // Call the business layer to process the payment
        businessLayer.processPayment(amount);

        scanner.close();
    }

    public static void main(String[] args) {
        BuyPresentationLayer presentationLayer = new BuyPresentationLayer();
        presentationLayer.startBuy();
    }
}
