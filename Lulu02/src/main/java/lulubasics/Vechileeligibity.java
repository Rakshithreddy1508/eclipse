package lulubasics;

import java.util.Scanner;

public class Vechileeligibity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a salary :  ");
		int salary = s.nextInt();


		if (salary>=420000) {
			System.out.println(" Loan has been approved");
		} else {
			System.out.println("Loan has been rejected");
		}


	}

}


//scanner s = new scanner(System.in);
// int sal = s.nextInt();