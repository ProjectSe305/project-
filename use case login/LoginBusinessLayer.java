// LoginBusinessLayer.java

public class LoginBusinessLayer {
    private LoginDataLayer dataLayer;

    public LoginBusinessLayer() {
        this.dataLayer = new LoginDataLayer();
    }

    public boolean login(String username, String password) {
        // Validate the credentials using the data layer
        return dataLayer.validateCredentials(username, password);
    }
}