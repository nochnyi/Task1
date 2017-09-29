package task1;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        System.out.println("Введите целые числа:");

        Scanner enteredNumbers = new Scanner(System.in);
        Integer n = enteredNumbers.nextInt();

        int Sum = 0;
        int Product = 1;

//        while (n != 0) {
//
//            Sum = Sum + n % 10;
//            n = n / 10;
//        }
//        System.out.println("The sum of all entered numbers is " + Sum);

        while (n != 0) {
            Product *= n % 10;
            n = n / 10;
        }
        System.out.println("Product of the entered numbers is " + Product);
    }

}

