package Lab6;

import java.util.Scanner;
public class Lab6_Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of matrices:");
        int a = input.nextInt();
        int[][][] m = new int[a][][];
        int len =0 ;
        for(int i=0;i<a;i++) {
            System.out.printf("Enter the number of row and column of matrix %d:" , i+1 );
            int x = input.nextInt();
            len = x ;
            int y = input.nextInt();
            m[i]=new int[x][y];
            System.out.println("Enter the elements of the matrix:");
            InIn(m[i],x,y);
        }

        int[][]ans = new int[len][len];
        if (a<2){ans=m[0];}
        else if (a == 2){
            matrixMultiplication(m[0],m[1],ans);
        }
        else{
            matrixMultiplication(m[0],m[1],ans);
            for(int i=2;i<a;i++){
                matrixMultiplication(ans,m[i],ans);
            }
        }
        System.out.println("The results:");
        print(ans);
    }

    public static void InIn(int[][]a, int x, int y){
        Scanner input = new Scanner(System.in);
        for (int i=0;i<x;i++){
            for(int j=0;j<y;j++) {
                int h = input.nextInt();
                a[i][j] = h ;
            }
        }
    }

    public static void matrixMultiplication (int[][]a,int[][]b,int[][]ans){
//        if ( a.length != b[0].length){
//            System.out.println("invalid input");
//            System.exit(0);
        ans = new int[a.length][a.length];
        for(int j=0;j<a.length;j++){
            for(int i=0;i<b[0].length;i++){
                for(int k=0;k<b.length;k++){
                    ans[i][j] += a[j][k]*b[k][i];
                }
            }
        }
    }

    public static void print (int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
