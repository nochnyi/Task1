package task1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        String userName = getString();
        System.out.println("Hello " + userName + " !");

    }

    private static String getString() {
        Scanner userNameScanner = new Scanner(System.in); // Entered users data are scanned by this parametre.
        return userNameScanner.nextLine();
    }
}

