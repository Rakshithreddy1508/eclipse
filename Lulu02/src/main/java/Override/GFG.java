package Override;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Custom input string
		        String str = "aaaabbbbb cccccddddd aaaaa bbbbbccceeeee bbbbbgggg";
		        String[] arrOfStr = str.split("aaaaa ", 3);

		        for (String a : arrOfStr) {
					System.out.println(a);
				}
	}
}
