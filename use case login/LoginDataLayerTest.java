import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginDataLayerTest {
    @Test
    public void testValidateCredentials_ValidCredentials() {
        // Create an instance of LoginDataLayer
        LoginDataLayer dataLayer = new LoginDataLayer();

        // Define valid username and password
        String validUsername = "admin";
        String validPassword = "password";

        // Validate the credentials
        boolean isValid = dataLayer.validateCredentials(validUsername, validPassword);

        // Assert that the credentials are valid
        assertTrue(isValid);
    }

    @Test
    public void testValidateCredentials_InvalidCredentials() {
        // Create an instance of LoginDataLayer
        LoginDataLayer dataLayer = new LoginDataLayer();

        // Define invalid username and password
        String invalidUsername = "user123";
        String invalidPassword = "wrongpassword";

        // Validate the credentials
        boolean isValid = dataLayer.validateCredentials(invalidUsername, invalidPassword);

        // Assert that the credentials are invalid
        assertFalse(isValid);
    }
}
