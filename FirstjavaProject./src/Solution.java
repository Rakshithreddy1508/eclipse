import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a N value:  ");
        int N = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " * " + i + " = " + result);


        }


        scanner.close();
    }
}
