package lab2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to CS107!");

        Scanner input = new Scanner(System.in);

        int number1, number2, sum;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        System.out.printf("Sum is %d\n", sum);
    }
}
