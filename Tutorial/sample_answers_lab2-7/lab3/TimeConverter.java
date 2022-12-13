package lab3;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = in.nextInt();
        int p1 = seconds % 60;
        int p3 = seconds / 60;
        int p2 = p3 % 60;
        p3 = p3 / 60;
        System.out.printf( "The equivalent time is %d hours %d minutes and %d seconds",p3 , p2 , p1);
        System.out.print("\n");
    }
}
