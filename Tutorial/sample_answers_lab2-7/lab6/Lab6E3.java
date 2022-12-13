package lab6;

import java.util.Scanner;

public class Lab6E3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of subjects: ");
        int courses = input.nextInt();
        System.out.print("Please enter the number of students: ");
        int students = input.nextInt();

        int score[][] = new int[courses][students];
        double sub[] = new double[courses];
        double stu[] = new double[students];

        //enter the information
        double sum = 0;
        for(int i = 0; i < courses; i++){
            sum = 0;
            for (int j= 0; j < students; j++){
                score[i][j] = input.nextInt();
                sum += score[i][j];
            }
            sub[i] = sum/students;
        }

        score_student(score, stu, courses);
        //the average score of student


        //print the result
        System.out.println();
        System.out.print("          ");
        for(int i = 0; i < courses; i++){
            System.out.printf("Course%-4d", i+1);
        }
        System.out.println("Average");

        for(int i = 0; i < students; i++){
            System.out.printf("Student%-3d", i+1);

            for(int j = 0; j < courses; j++){
                System.out.printf("   %-7d", score[j][i]);
            }
            System.out.printf(" %.2f\n", stu[i]);
        }

        System.out.print("Average    ");
        for(int i = 0; i < courses; i++){
            System.out.printf(" %.2f    ", sub[i]);
        }
        System.out.println();

    }

    public static void score_student(int[][] score, double[] a_score, int sub){
        //the average score of student
        double sum = 0;
        for(int i = 0; i < a_score.length; i++){
            sum = 0;
            for (int j = 0 ; j < sub ; j++){
                sum += score[j][i];
            }
            a_score[i] = sum/sub;
        }
    }

}