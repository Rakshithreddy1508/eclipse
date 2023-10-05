import java.util.Scanner;

public class WeekNameProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a WeekNumber: ");
		int WeekNumber = scanner.nextInt();

		String WeekName= null;
		switch (WeekNumber) {
		case 1: WeekName = "SUNDAY";
		break;
		case 2: WeekName = "MONDAY";
		break;
		case 3: WeekName = "TUESDAY";
		break;
		case 4: WeekName = "WEDNESDAY";
		break;
		case 5: WeekName = "THRUSDAY";
		break;
		case 6: WeekName = "FRIDAY";
		break;
		case 7: WeekName = "SATURDAY";
		break;
		default: WeekName = "invalid";
		break;
		}
	      System.out.println("This week name is : " + WeekName);
		}
	}



