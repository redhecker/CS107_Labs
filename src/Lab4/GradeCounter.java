package Lab4;

import java.util.Scanner;
//java.util 包
public class GradeCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入班级人数:");
        int a = input.nextInt();
        double sum = 0 ;
        int score = 0 ;
        for ( int i = 1 ; i < a+1 ; i++ ){
            System.out.printf("请输入第%d个学生的分数：" , i );
            score = input.nextInt();
            sum = sum + score ;
        }//输入学生分数
        double average = sum / a ;
        System.out.printf("班级总分为：%d\n" , sum );
        System.out.print("班级平均分为：");
        System.out.println( average );
        input.close();//close the scanner after use|一直开着会占用内存
    }
}
