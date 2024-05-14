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