import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		student student = new student("Ram",99,95,35,77);

		int number = student.getnumberofmarks();
		System.out.println("Number of marks: " + number);

		int sum = student.getsumofmarks();
		System.out.println("sum of marks: " + sum);

		int maximummark = student.getmaximummark();
		System.out.println("Maximum Number of marks: " + maximummark);

		int minimummark = student.getminimummark();
		System.out.println("Minimum Number of marks: " + minimummark);

		BigDecimal average = student.getAverageMark();
		System.out.println("Average of marks: " + average);
	}
}
