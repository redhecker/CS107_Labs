package Lab6;

import java.util.Scanner;
public class Lab6_Practice1_MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input three numbers for a, b, c:");
        while (input.hasNextDouble()) {
            double a = input.nextDouble();
            if (a == -1) {
                System.exit(0);
            }
            double b = input.nextDouble();
            double c = input.nextDouble();
            boolean m = isValid(a, b, c);
            if ( m ){
                double area = area(a,b,c);
                double perimeter = perimeter(a,b,c);
                System.out.printf("The area is %.3f\nThe perimeter is %.3f\n" , area , perimeter );
            }
            else {
                System.out.println("The input is invalid.");
            }
            System.out.print("Please input three numbers for a, b, c:");
        }
    }
    public static double area(double a, double b, double c) {
        double p = ( a + b + c ) / 2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S ;
    }
    public static double perimeter(double a, double b, double c) {
        a += b;
        a += c;
        return a;
    }
    public static boolean isValid(double a, double b, double c){
        if ( a+b > c && b+c > a && a+c > b ){
            return true;
        }
        else {
            return false;
        }
    }
}