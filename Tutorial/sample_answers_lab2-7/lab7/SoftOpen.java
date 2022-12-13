package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class SoftOpen {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Food> foodList = generateMenu();  //generate a Menu
		User user = generateUser();				//generate a user
		user.introduce();							//show the account of the user
		userConsume(foodList,user);				//user consume
		user.introduce();							//after consume, show the account of the user

		in.close();
	}
	public static User generateUser(){

		User user =new User();
		System.out.print("Generate a user, please input name: ");
		String account = in.next();
		user.setUser(account);
		System.out.print("Balance($):");
		user.setPassword("123456");			//default password
		double money = in.nextDouble();
		user.setMoney(money);
		return user;
	}
	public static ArrayList<Food> generateMenu(){
		Food pizza1=new Food();
		pizza1.setId(1);
		pizza1.setName("pizza");
		pizza1.setType("Seafood");
		pizza1.setSize(11);
		pizza1.setPrice(12);

		Food pizza2=new Food();
		pizza2.setId(2);
		pizza2.setName("pizza");
		pizza2.setType("Beef");
		pizza2.setSize(9);
		pizza2.setPrice(10);

		Food friedRice =new Food();
		friedRice.setId(3);
		friedRice.setName("fried rice");
		friedRice.setType("Seafood");
		friedRice.setSize(5);
		friedRice.setPrice(12);

		Food noodles =new Food();
		noodles.setId(4);
		noodles.setName("noodles");
		noodles.setType("Beef");
		noodles.setSize(6);
		noodles.setPrice(14);

		ArrayList<Food> foodList=new ArrayList<>();
		foodList.add(pizza1);
		foodList.add(pizza2);
		foodList.add(friedRice);
		foodList.add(noodles);
		return foodList;
	}
	public static void getMenu(ArrayList<Food> foodList){
		System.out.println("----------------------------------Menu--------------------------------");
		for(Food food:foodList) {
			food.showInformation();
		}
		System.out.println("----------------------------------Menu--------------------------------");
	}

	public static void userConsume(ArrayList<Food> foodList, User user){
		getMenu(foodList);
		double cost = userSelect(foodList);
		if(cost > 0)
			user.withdraw(cost);
		else
			System.out.println(user.getAccount() + "consume 0$");
	}

	public static double userSelect(ArrayList<Food> foodList){

		double cost = 0.0;
		System.out.println("Please input the foodID and the number you want, to exit input 0");
		while(true){
			System.out.print("Food id (input 0 to end select):");
			int foodId = in.nextInt();
			if(0==foodId) {
				System.out.println("Select end");
				return cost;
			}
			if(foodId<0 || foodId>foodList.size()){
				System.out.println(foodId+" not in the menu,try again");
				continue;
			}
			System.out.print("Number of this food:");
			int num = in.nextInt();
			if(num < 0) {
				System.out.println("Wrong number,try again");
				continue;
			}
			cost += foodList.get(foodId-1).getPrice()*num;
		}

	}
}
