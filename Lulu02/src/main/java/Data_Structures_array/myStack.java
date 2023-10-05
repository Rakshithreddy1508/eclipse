package Data_Structures_array;
import java.util.Scanner;



public class myStack {
	static int ch;

 

	public static void main(String[] args) {
		stack obj = new stack();
		while (true) {
			System.out.println("\nEnter your choice\n1.PUSH\n2.POP\n3.Display\n4..EXIT");
			Scanner integer = new Scanner(System.in);
			ch = integer.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element");
				obj.element = integer.nextInt();
				obj.push(obj.element);
				break;
			case 2:
				System.out.printf("Poped element is %d", obj.pop());
				break;
			case 3:
				obj.display(obj.st, obj.top);
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong option");
			}
		}
	}
}
