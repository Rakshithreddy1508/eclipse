import java.util.Scanner;

public class NumberinputRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.print("enter number1");
		int number1 = Scanner.nextInt();

		System.out.print("enter number2");
		int number2 = Scanner.nextInt();

		System.out.println("Choices avilable");
		System.out.println("1 = Add");
		System.out.println("2 = Substract");
		System.out.println("3 = Multipication");
		System.out.println("4 = Divide");

		System.out.print("enter a choice");
		int choice = Scanner.nextInt();

		System.out.println("your choices are");
		System.out.println("The Number1 you entered is " +number1);
		System.out.println("The Number2 you entered is " +number2);
		System.out.println("The choice you entered is " +choice);

	   performoperationusingSwitch(number1, number2, choice);
	}

	private static void performoperationusingnestedifelse(int number1, int number2, int choice) {
		if(choice==1) {
			System.out.println("Result = " +(number1 + number2));
		} else
			if(choice==2) {
				System.out.println("Result = " +(number1 - number2));
			} else
				if(choice==3) {
					System.out.println("Result = " +(number1 * number2));
				} else
					if(choice==4) {
						System.out.println("Result = " +(number1 / number2));
					} else {
						System.out.println("Invalid Operations");
					}
	}

		private static void performoperationusingSwitch(int number1, int number2, int choice) {
			switch(choice) {
			case 1 : System.out.println("Result = " +(number1 + number2));
			break ;
			case 2 : System.out.println("Result = " +(number1 - number2));
			break ;
			case 3 : System.out.println("Result = " +(number1 * number2));
			break ;
			case 4 : System.out.println("Result = " +(number1 / number2));
			break ;
			default : System.out.println("Invalid Operations");
			break ;
			}
	}
}
