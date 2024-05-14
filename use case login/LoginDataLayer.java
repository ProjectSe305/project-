// LoginDataLayer.java

public class LoginDataLayer {
    // Dummy data for demonstration purposes
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password";

    public boolean validateCredentials(String username, String password) {
        // Perform validation against a database or other data source
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}