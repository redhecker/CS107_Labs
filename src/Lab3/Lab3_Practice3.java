package Lab3;

public class Lab3_Practice3 {
    public static void main(String[] args) {
        float grade = Float.parseFloat(args[0]);
        float GPA = 0;
        if (grade > 100 ^ grade < 0){
            if (grade > 100 ){System.out.print("Are you kidding me ???!!!");}
            else {System.out.print("Oh , how silly ! ");}
            System.exit(0);
        }
        else if (grade >= 90 ) {
            GPA = 4.0F;
        }
        else if (grade >= 80 ) {
            GPA = 3.0F;
        }
        else if (grade >= 70 ) {
            GPA = 2.0F;
        }
        else if (grade >= 60 ) {
            GPA = 2.0F;
        }
        else{
            GPA = 0.0F;
        }
        if ( grade > 60 ){System.out.println("You passed the exam.");}
        else {System.out.println("You failed the exam.");}
        System.out.printf("Your score is %.2f , the GPA is %.2f " , grade , GPA );
    }

}
