package Lab7;

import java.util.Scanner;
import java.util.ArrayList;
import Lab7.Food;
import Lab7.User;


public class Lab7_Practice {

    public static void main(String[]args){
        ArrayList<Food> foodList = generateMenu();
        User user = generateUser();
        user.introduce();
        userConsume(foodList,user);
        user.introduce();
    }

    private static User generateUser() {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("Generate a user, please input name: ");
        user.setUser(sc.next());
        user.setPassword("123456");
        System.out.print("Balance($): ");
        user.setMoney(sc.nextInt());
        return user;
    }


    public static ArrayList<Food> generateMenu(){
        ArrayList<Food>foodList = new ArrayList<Food>();
        foodList.add(new Food());
        foodList.get(0).setter(1,"pizza","Seafood",11,12);
        foodList.add(new Food());
        foodList.get(1).setter(2,"pizza","Beef" ,9 ,10);
        foodList.add(new Food());
        foodList.get(2).setter(3,"fried rice", "Seafood", 5 ,12);
        foodList.add(new Food());
        foodList.get(3).setter(4,"noodles", "Beef" ,6, 14);
        return foodList;
    }

    public static void userConsume(ArrayList<Food> foodList, User user){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-------------------------------------Menu-----------------------------");
        for(int i=1;i<=4;i++){
            foodList.get(i-1).showInformation();
        }
        System.out.println("-------------------------------------Menu-----------------------------");

        System.out.print("Please input the foodID and the number you want, to exit input 0\n");
        int a=0;
        double mon=0;

        do{
            System.out.print("Food id (input 0 to end select):");
            a = sc.nextInt();
            if(a == 0)continue;
            System.out.print("Number of this food:");
            int n = sc.nextInt();
            mon += foodList.get(a - 1).getprice() * n;
        }while(a!=0);
        System.out.println("Select end");
        user.withdraw(mon);
    }

}
