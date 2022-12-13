package Lab5;

import java.util.Scanner;

public class Lab5_Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] c = new int[100];
        System.out.print("Enter the integers between 1 and 100:");

        while(input.hasNextInt()){
            int a = input.nextInt();
            if ( a == 0 ){
                break;
            }
            else if ( a>0 & a<101 ){
                c[a-1]++;
            }
            else {
                System.out.print("please make sure the integers are between 1 annd 100 !");
            }
        }

        for ( int i = 1 ; i <= c.length ; i++ ){
            if ( c[i-1] != 0 ){
                if ( c[i-1] == 1 ) {
                    System.out.printf("%d occurs 1 time\n" , i );
                }
                else {
                    System.out.printf("%d occurs %d times\n" , i , c[i-1] );
                }
            }
        }
    }
}
