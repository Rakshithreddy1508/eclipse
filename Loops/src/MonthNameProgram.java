import java.util.Scanner;

public class MonthNameProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter monthnumber (1-12): ");
		int monthnumber = scanner.nextInt();

		String MonthName = null;

		switch(monthnumber) {
		case 1 : MonthName = "JAN";
		break;
		case 2 : MonthName = "FEB";
		break;
		case 3 : MonthName = "MARCH";
		break;
		case 4 : MonthName = "APIRL";
		break;
		case 5 : MonthName = "MAY";
		break;
		case 6 : MonthName = "JUNE";
		break;
		case 7 : MonthName = "JULY";
		break;
		case 8 : MonthName = "AUGUST";
		break;
		case 9 : MonthName = "SEPTEMBER";
		break;
		case 10 : MonthName = "OCTOBER";
		break;
		case 11 : MonthName = "NOVEMBER";
		break;
		case 12 : MonthName = "DECEMBER";
		break;
		default :MonthName = "invalid";
		break;
	 }
      System.out.println("This month is : " +MonthName);
   }
}
