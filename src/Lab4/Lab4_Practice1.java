package Lab4;

import java.util.Scanner;

public class Lab4_Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number to print the Multiplication Table [0 to terminate]: ");
        int a = input.nextInt();
        while ( a != 0 ){
            if ( a>=1 && a<= 9 ){
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("%d * %d = %d  ", j, i, j * i);
                    }
                    System.out.println();
                }

                }
            else{
                System.out.println("Please input a number between [1,9]");
            }
            System.out.print("Please input a number to print the Multiplication Table [0 to terminate]: ");
            a = input.nextInt();
        }
        System.exit(0) ;
    }
}
