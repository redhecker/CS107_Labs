package lab7;

import java.util.Scanner;

public class User {
	private String account;
	private String password;
	private double money;
	
	public String getAccount() {
		return account;
	}
	public void setUser(String account) {
		this.account = account;
	}
	public boolean inputPassword() {
		Scanner in = new Scanner(System.in);

		System.out.println("Please input your password:");
		final int times = 3;
		for(int i=1;i<=times;i++) {
			String password = in.next();
			if (password.equals(this.password)) {
				return true;
			} else {
				int leftTimes = times - i;
				System.out.printf("password error,there are %d times left to try\n",leftTimes );
				if(leftTimes>0)
					System.out.println("Please input your password:");
			}
		}
		in.close();
		return false;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	public void introduce() {
		System.out.printf("%s's account has a balance of %.2f dollar\n",this.account,this.money);
	}
	
	public void withdraw(double money) {
		if(this.money<money) {
			System.out.printf("Plan to withdraw %.2f dollar, but no sufficient balance\n",money);
		}else {
			System.out.printf("Plan to withdraw %.2f dollar, okay\n",money);
			boolean ok=inputPassword();
			if (ok) {
				this.money -= money;
				System.out.printf("Withdraw %.2f dollar and balance is %.2f dollar\n",
						money, this.money);
			} else {
				System.out.println("password error,expense failed");
			}
		}
	}
	public void deposit(double money) {
		this.money+=money;
		System.out.printf("Got %.2f as income,balance is %.2f dollar\n",money,this.money);
	}
}
