package Lab10;

import java.util.Scanner;

public class PM_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your budget: ");
        int budget = in.nextInt(),a=0;
        for(PhoneModel phone : PhoneModel.values()){
            if(budget >= phone.getPrice()) {
                System.out.printf("%-10s\t%10s: %d\n", phone.name(), "price", phone.getPrice());
                a++;
            }
        }
        if(a == 0){
            System.out.println("You don't have sufficient money");
        }
    }
}
