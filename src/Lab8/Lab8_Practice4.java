package Lab8;

import java.util.Scanner;

public class Lab8_Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("s1: ");
        String s1 = input.nextLine();
        System.out.print("s2: ");
        String s2 = input.nextLine();
        int n = 0;
        for(int i=0;i<=s1.length()-s2.length();i++){
            if(s2.equals(s1.substring(i,i+s2.length()))){
                System.out.println("Found at index: "+i);
                n++;
            }
        }
        System.out.println("Total occurrences: "+n);
    }
}
