package lulubasics;

import java.util.Scanner;

public class Votereligibility {

	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();

	void checkage() {

		   if(age>=18) {
			System.out.println("eligible to vote");
		   }
		else {
			System.out.println("Not eligible to vote");
		     }
	}

}
