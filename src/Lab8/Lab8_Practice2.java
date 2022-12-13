package Lab8;

import java.util.Scanner;

public class Lab8_Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Type a string (\"quit\" to finish): ");
            String x = input.next();
            String x1=x;
            x1 = x1.toLowerCase();
            if(x1.equals("quit")) break;
            int n = x1.length();
            String x2 = swi(x1,n);
            if(x1.equals(x2))System.out.printf("%s is a palindrome\n",x);
            else System.out.printf("%s is not a palindrome\n",x);
        }
    }

    public static String swi(String s,int n){
        char[]a = new char[n];
        for(int i=0;i<n;i++){
            a[i] = s.charAt(i);
        }
        for(int i=0;i <= n/2-1;i++){
            swt(a,i,n-1-i);
        }
        s="";
        for(char i : a){
            String m = String.valueOf(i);
            s += m;
        }
        return s;
    }
    public static void swt(char[]a, int m, int n){
        char x = a[m];
        a[m] = a[n];
        a[n] = x;
    }
}
