package lab2;

import java.util.Scanner;
public class FormatDemo {

    public static void printStairs(int n)
    {
        for(int level=0; level<n; level++)
        {
            for(int i=0; i<=level; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printStairs(20);
    }
}
