import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BuyDataLayerTest {
    @Test
    public void testProcessPayment() {
        // Create a ByteArrayOutputStream to capture the printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create an instance of BuyDataLayer
        BuyDataLayer dataLayer = new BuyDataLayer();

        // Define test input
        double amount = 100.0;

        // Call the method under test
        dataLayer.processPayment(amount);

        // Assert the output matches the expected output
        String expectedOutput = "Payment processed successfully: $" + amount + "\n";

        // Reset System.out to its original value
        System.setOut(System.out);
    }
}
