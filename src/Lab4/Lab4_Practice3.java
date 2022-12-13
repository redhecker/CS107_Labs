package Lab4;

import java.util.Scanner;

public class Lab4_Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter expressions such as 2.0 + 2. Type -1 to quit.");
        double a = input.nextDouble();
        while ( a != -1 ) {
            String s = input.next();
            char c = s.charAt(0);
            double b = input.nextDouble();
            double result = 0 ;
            switch ( c ) {
                case '+':
                    result = a+b ;
                    break;
                case '-':
                    result = a-b ;
                    break;
                case '*':
                    result = a*b ;
                    break;
                case '/':
                    if (b==0){
                        System.out.println("0 cannot be divided");
                        System.exit(0) ;
                    }
                    result = a/b ;
                    break;
                default:
                    System.out.printf("Unknown operator: %s" , s );
                    break;
            }
            System.out.printf("Result : %f\n" , result );
            System.out.println("Enter expressions such as 2.0 + 2. Type -1 to quit.");
            a = input.nextDouble();
        }
        System.out.print("exit");
        System.exit(0);
    }
}
