import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a value");
		int num = scanner.nextInt();

		if(num>0) {
			System.out.println(num + "is a positive");
		}else {
			if(num<0) {
				System.out.println(num + " is a negative");
		} else {
			System.out.println(num + "is a zero");
		}
	  }
	}
}

