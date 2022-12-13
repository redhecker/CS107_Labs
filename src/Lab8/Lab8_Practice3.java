package Lab8;

import java.util.Scanner;

public class Lab8_Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please type a string: ");
        String s = sc.nextLine();
        char[]c = new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i] = s.charAt(i);
            int n=0;
            for(char j : c){
                if( c[i] == j )n++;
            }
            if(n>1)c[i]=' ';
        }
        print(c);

    }
    public static void print(char[]a){
        if(a.length==0) {
            System.out.print("Empty string, exit…");
            System.exit(0);
        }
        System.out.print("After removing repeating chars and spaces: ");
        for(char i : a){
            if(i!=' ') System.out.print(i);
        }
    }
}
