package task1;

import java.util.Scanner;


public class Practice4 {
    public static void main(String[] args) {

        System.out.println("Please, enter your password:");

        String Scan = scanEnteredPassword();

        String Password = "Password123";

        compareString(Scan, Password);

    }

    private static String scanEnteredPassword() {
        Scanner enteredPassword = new Scanner(System.in); // Entered users data are scanned by this parametre.
        return enteredPassword.nextLine();
    }

    private static void compareString(String scan, String password) {
        if (scan.equals(password)) {
            System.out.println("Welcome to your Account!");
        } else {
            System.out.println("You entered an incorrect password. Please try again!");
        }
    }
}
