package Lab5;

import java.util.Scanner;

public class Lab5_Practice6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int s = input.nextInt();
        int[] a = new int[s];
        System.out.printf("Enter %d numbers: " , s );

        for ( int i=0 ; i < a.length ; i++ ){
            a[i] = input.nextInt();
        }

        long current1=System.currentTimeMillis();

        int sum = 0 ;
        for (int i : a ){
            sum += i ;
        }

        double average = (double) sum / s ;
        System.out.printf("average=%f \n" , average );

        int db = (int)(average*2) , pairs = 0 ;
        for ( int i = s-1 ; i >= 0 ; i--){
            if( a[i]+a[i-1] < db ){break;}
            for ( int j = i-1 ; j >= 0 ; j--){
                if( a[j]+a[i] > db ){ pairs++;}
                else{break;}
            }
        }


        long current2=System.currentTimeMillis();
        System.out.println("The number of pairs of integer is "+pairs);
        System.out.printf("your program using %.3f " + "second",(current2-current1)/1000.0d);
        input.close();
    }
}
