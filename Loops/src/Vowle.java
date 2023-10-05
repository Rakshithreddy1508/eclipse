import java.util.Scanner;

public class Vowle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a value: ");
         char ch = scanner.next().charAt(0);

         if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println("Its a vowel");
			} else
         if(ch!='A' || ch!='E' || ch!='I' || ch!='O' || ch!='U' || ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u') {
				System.out.println("Its a Constuant");
			} else {
			System.out.println("invalid");
		}
	}

}
