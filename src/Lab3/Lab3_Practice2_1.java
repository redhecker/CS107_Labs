package Lab3;

import java.util.Scanner;

public class Lab3_Practice2_1 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of seconds:");
//        int a = input.nextInt();
        int a = Integer.parseInt(args[0]);
        int m = 0 , n = 0 ;
        while ( a >= 3600 ){
            m ++ ;
            a = a - 3600 ;
        }
        while ( a >= 60 ){
            n ++ ;
            a = a - 60 ;
        }
        System.out.printf("The equivalent time is %d hours %d minutes and %d seconds" , m , n , a );
    }

}
