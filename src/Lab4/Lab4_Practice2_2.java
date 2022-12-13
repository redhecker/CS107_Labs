package Lab4;

import java.util.Scanner;


public class Lab4_Practice2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the precision:");
        double pi = Math.PI;
        double precision = input.nextDouble();
        double p = 0  ;
        int counter = 1 ;
        while( precision <= pi-p | precision <= p-pi ){
            int x = 4 ;
            int b = 2*counter - 1 ;
            double c = (double)x / b ;
            if ( counter%2 != 0 ) {
                p += c;
            }
            else { p -= c ; }
            counter ++ ;
        }
        counter --;
        System.out.printf("The estimatioin of Pi is %f\n" , p );
        System.out.printf("It computed %d times" , counter );
    }
}