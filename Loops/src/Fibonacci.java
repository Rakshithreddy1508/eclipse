public class Fibonacci {
    public static void main(String[] args) {
        int limit = 10;
        int firstNum = 1, secondNum = 2;

        System.out.print("Fibonacci Series: ");
        System.out.print(firstNum + " " + secondNum);

        for (int i = 1; i < limit; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(" " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}