package lab4;

import java.util.Scanner;

public class Calculator {

       /*  This program evaluates simple expressions such as 2.0 + 2.0
           The operators +, -, *, / are allowed.
           The program will read and evaluate expressions until
           the user inputs a line that starts with the number -1.
       */

    public static void main(String[] args) {

        double firstNum;
        double secondNum;
        char operator;
        double value;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter expressions such as  2.0 + 2. Type -1 to quit.");
        while (true) {
            firstNum = sc.nextDouble();
            if (firstNum == -1)
                break;
            operator = sc.next().charAt(0);
            secondNum = sc.nextDouble();


            switch (operator) {
                case '+':
                    value = firstNum + secondNum;
                    break;
                case '-':
                    value = firstNum - secondNum;
                    break;
                case '*':
                    value = firstNum * secondNum;
                    break;
                case '/':
                    value = firstNum / secondNum;
                    break;
                default:
                    System.out.println("Unknown operator: " + operator);
                    continue;
            }

            System.out.println("Result: " + value);

        }
    }
}