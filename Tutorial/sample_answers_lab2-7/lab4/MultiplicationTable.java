package lab4;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please input a number to print the Multiplication Table [0 to terminate]:");
           int  n = input.nextInt();
            if (n == 0) {
                break;
            } else if (n < 0 || n > 9) {
                System.out.println("Please input a number between [1,9]");
                continue;
            } else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                      System.out.printf("%d * %d = %2d  ", j, i, j * i);
                    }
                    System.out.println();
                }
            }
        }
        input.close();
    }
}