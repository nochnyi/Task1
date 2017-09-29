package task1;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        String reverse = getReverse();
        System.out.println(reverse);

    }

    private static String getReverse() {
        Scanner userNameScanner = new Scanner(System.in); // Entered users data are scanned by this parametre.
        String phrase = userNameScanner.nextLine();
        return new StringBuffer(phrase).reverse().toString();
    }
}
