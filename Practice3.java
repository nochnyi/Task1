package task1;

import java.util.Scanner;
import java.util.Random;

public class Practice3 {
    public static void main(String[] args) {

        Scanner userNumber = new Scanner(System.in); // Entered users data are scanned by this parametre.
        Integer n = userNumber.nextInt();

        Random r = new Random();
        int[] arr = new int[n];

        nextLine(r, arr);
        inLine(r, arr);

    }

    private static void inLine(Random r, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
            System.out.print(arr[i]);
        }
    }

    private static void nextLine(Random r, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
            System.out.println(arr[i]);
        }
    }
}




