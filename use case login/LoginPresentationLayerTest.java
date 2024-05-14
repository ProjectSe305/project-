import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginPresentationLayerTest {
    private LoginBusinessLayer mockBusinessLayer;
    private LoginPresentationLayer presentationLayer;
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        System.setIn(systemIn);
    }

    @Test
    public void testStartLogin_ValidCredentials() {
        // Prepare test input
        String username = "user123";
        String password = "password123";
        String input = username + "\n" + password + "\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Set up the mock to return true for valid credentials

        // Call method under test
        presentationLayer.startLogin();


    }

    @Test
    public void testStartLogin_InvalidCredentials() {
        // Prepare test input
        String username = "user456";
        String password = "wrongpassword";
        String input = username + "\n" + password + "\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Set up the mock to return false for invalid credentials

        // Call method under test
        presentationLayer.startLogin();

        // Verify that the appropriate error message was printed
    }
}
