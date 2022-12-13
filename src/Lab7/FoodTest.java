package Lab7;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        ArrayList<Food>foodlist = new ArrayList<Food>();

        foodlist.add(new Food());
        foodlist.get(0).setter(1,"pizza","Seafood",11,12);
        foodlist.add(new Food());
        foodlist.get(1).setter(2,"pizza","Beef" ,9 ,10);
        foodlist.add(new Food());
        foodlist.get(2).setter(3,"fried rice", "Seafood", 5 ,12);
        foodlist.add(new Food());
        foodlist.get(3).setter(4,"noodles", "Beef" ,6, 14);

        System.out.println("\n-------------------------------------Menu-----------------------------");
        for(int i=1;i<=4;i++){
        foodlist.get(i-1).showInformation();
        }
        System.out.println("-------------------------------------Menu-----------------------------");
    }
}