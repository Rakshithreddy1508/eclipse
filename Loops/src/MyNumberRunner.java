
public class MyNumberRunner {

	public static void main(String[] args) {
       MyNumber number = new MyNumber(5);
       boolean isPrime = number.isPrime();
       System.out.println("isPrime " + isPrime);

       int sum = number.sumUptoN();
       System.out.println("sumuptoN  " + sum);

       int sumofDivisors = number.sumofDivisors();
       System.out.println("sumofDivisors " + sumofDivisors);

       number.printNumberTriangle();
	}

}
