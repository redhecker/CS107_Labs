package Lab4;

import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int magicNum = random.nextInt(10);
        int inputNum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input an Integer in {0,1,2,...,9}:");
        inputNum = sc.nextInt();

        while( inputNum != magicNum) {
            if (inputNum > magicNum) {
                System.out.print("\nToo big!Please try again:");
                inputNum = sc.nextInt();
            }
            else {
                System.out.print("\nToo small!Please try again:");
                inputNum = sc.nextInt();
            }
        }
        System.out.println("Congratulations!");
        sc.close();
    }
}
