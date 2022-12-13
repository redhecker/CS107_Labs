package Lab6;

import java.util.Scanner;
public class Lab6_Practice2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input two numbers for bottom and height:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double area = area1(a , b);
        System.out.printf("The area is %.3f\n" , area);

        System.out.print("Please input two numbers for a and b:");
        double m = input.nextDouble();
        double n = input.nextDouble();
        System.out.print("Please input a number in (0, 180) for angle (angle is a float variable):");
        double s = input.nextDouble();
        area = area2(m,n,s);
        System.out.printf("The area is %.3f" , area);
    }
    public static double area1(double bottom, double height){
        bottom *= (0.5*height);
        return bottom;
    }
    public static double area2(double a, double b, double angleOfAandB){
        double area = 0.5 * a * b * Math.sin(angleOfAandB/180*Math.PI);
        return area;
    }

}
