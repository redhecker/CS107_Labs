package Lab6;

import java.util.Scanner;
public class Lab6_Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of subjects: " );
        int subject = input.nextInt();
        System.out.print("Please enter the number of students:" );
        int student = input.nextInt();
        int[][] score = new int[subject][student];

        for (int i = 0 ; i < subject ; i++){
            for (int j = 0 ; j < student ; j++){
                score[i][j] = input.nextInt();
            }
        }

        double[] stua = new double[student];
        double[] subb = new double[subject];
        fo(subb,stua,score);

        System.out.println("");
        System.out.printf("%-10s" , "");
        for (int i=0; i<subject ; i++) {
            System.out.printf("%s%-5d","Course",i+1);
        }
        System.out.printf("%-10s\n" , "Average");
        for (int i=0; i<student ; i++) {
            System.out.printf("%-5s%-5d" , "Student" , i+1);
            for (int j=0 ; j<subject ; j++){
                System.out.printf( "%-10d" , score[j][i] );
            }
            System.out.printf("%-10.2f\n" , stua[i]);
        }
        System.out.printf("%-10s" , "Average");
        for (int j=0 ; j<subject ; j++){
            System.out.printf( "%-10.2f" , subb[j] );
        }

    }
    public static void fo(double[]a,double[]b,int[][]c){
        for (int i = 0; i < a.length ; i++){
            for (int j = 0 ; j < b.length ; j++ ){
                a[i] += c[i][j];
            }
            a[i] /= b.length;
        }
        for (int i = 0; i < b.length ; i++){
            for (int j = 0 ; j < a.length ; j++ ){
                b[i] += c[j][i];
            }
            b[i] /= a.length;
        }
    }
}
