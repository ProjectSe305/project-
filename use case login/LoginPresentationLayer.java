// LoginPresentationLayer.java

import java.util.Scanner;

public class LoginPresentationLayer {
    private LoginBusinessLayer businessLayer;

    public LoginPresentationLayer() {
        this.businessLayer = new LoginBusinessLayer();
    }
// add an if statment that show were is the invalid case eathir in username or in password
    public void startLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login Page");
        System.out.println("----------");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        int loginStatus loggedIn = businessLayer.login(username, password);

        if (loginStatus==1) {
            System.out.println("Login successful!");
        } else  if (loginStatus==-1){
            System.out.println("Invalid username.");
        }  if (loginStatus==2){
         System.out.println("Invalid pasword.");
        } else{
           System.out.println("Unknowen erorr.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        LoginPresentationLayer presentationLayer = new LoginPresentationLayer();
        presentationLayer.startLogin();
    }
}
