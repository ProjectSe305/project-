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
    public void processPayment(double amount) {
        // Perform additional business logic here if needed

        // Call the data layer to process the payment
        dataLayer.processPayment(amount);
    }
}