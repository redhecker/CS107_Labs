package Lab4;

import java.util.Scanner;

public class Lab4_Practice2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input n: ");
        long n = input.nextLong();
        double pi = 0 ;
        for (int i = 1 ; i<= n ; i++ ){
            long a = 4 ;
            long b = 2*i - 1 ;
            double c = (double)a / b ;
            if ( i%2 != 0 ){
                pi += c ;
            }
            else { pi -= c ; }
        }
        System.out.printf("The estimatioin of Pi is:%f" , pi );
    }
}
