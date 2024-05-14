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
     */ // add total aomunt 
    public void processPayment(double price , String name) {
      

        dataLayer.processPayment(price);
    }
}
