package lab4;

import java.util.Scanner;


public class Pi1 {

	public static void main(String[] args) {
		float Pi = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please input n:");
		int n = in.nextInt();
		in.close();
		int i = 1;

		while(n >= i){
			if(i % 2 == 0)
			{
				Pi -= 4.0f/(2*i-1);

			}
			else
				Pi += 4.0f/(2*i-1);

			i++;
		}


		System.out.printf("The estimatioin of Pi is %.6f \n", Pi);
	}

}
