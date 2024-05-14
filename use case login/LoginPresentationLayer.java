// LoginPresentationLayer.java

import java.util.Scanner;

public class LoginPresentationLayer {
    private LoginBusinessLayer businessLayer;

    public LoginPresentationLayer() {
        this.businessLayer = new LoginBusinessLayer();
    }

    public void startLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login Page");
        System.out.println("----------");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean loggedIn = businessLayer.login(username, password);

        if (loggedIn) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        LoginPresentationLayer presentationLayer = new LoginPresentationLayer();
        presentationLayer.startLogin();
    }
}