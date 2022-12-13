package Lab7;

import java.util.Objects;
import java.util.Scanner;

public class User {
    private String account;

    private String password;

    private double money;

    public void setUser(String account){
        this.account = account;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setMoney(double money){
        this.money = money;
    }

    public void introduce(){
        System.out.printf("\n%s's account has a balance of %.2f dollar\n",account,money);
    }

    public void withdraw(double value){
        if(value > money){
            System.out.printf("Plan to withdraw %.2f dollar, but no sufficient balance\n" , value);
            return;
        }
        System.out.printf("Plan to withdraw %.2f dollar, okay\n" , value);
        for(int i=1;i<=3;i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Please input your password:");
            String pass = input.next();
            if(Objects.equals(pass, password)){
                money -= value;
                System.out.printf("Withdraw %.2f dollar and balance is %.2f dollar ", value , money );
                return;
            }
            else{System.out.printf("\npassword error,there are %d times left to try\n", 3-i);}
        }
    }

    public void deposit(double value){
        money += value;
        System.out.printf("\nGot %.2f as income,balance is %.2f dollar",value,money);
    }
}
