package lulubasics;

public class BankTester {

	public static void main(String[] args) {
		Bankapp B = new Bankapp();

		B.OpenAccount("Ram", 3000, 1240568990);
		B.deposite(5000);
		B.info();
	}

}
