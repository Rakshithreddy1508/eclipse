package lulubasics;

public class Bankapp {

	String name;
	double balance;
	long contact;

	void OpenAccount(String n,double b, long c) {

		name = n;
		balance = b;
		contact = c;

		System.out.println("Account opened");
	}

	void deposite(double amount) {
		balance =balance+amount;

	}

	void info() {

		System.out.println("Name is " +name);
		System.out.println("Balance is " +balance);
		System.out.println("Contact is " +contact);
	}

	}
