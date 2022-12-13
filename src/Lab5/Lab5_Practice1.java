package Lab5;

import java.util.Scanner;

public class Lab5_Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of myList1:");
        int a = input.nextInt();
        double [] myList1 = new double[a];
        double [] myList2 = new double[a];
        System.out.printf("Enter %d values: " , a );

        for ( int i = 0 ; i < myList1.length ; i++ ){
            double b = input.nextDouble();
            myList1[i] = b ;
            myList2[i] = b ;
        }

        for ( int i = 2 ; i <= a ; i++ ){
            double temp = myList1[a-i];
            myList1[a-i] = myList1[a-1];
            myList1[a-1] = temp;
        }

        System.out.print("myList1:");
        for ( double i : myList1 ){
            System.out.printf( "%.1f " , i );
        }

        System.out.println("");
        System.out.print("myList2:");
        for ( double i : myList2 ){
            System.out.print( i + " " );
        }
    }
}
