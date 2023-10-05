
public class MyCharRunner {

	public static void main(String[] args) {
	     MyChar myChar = new MyChar('a');
	     System.out.println(myChar.isVowel()); // a,e,i,o,u Vowels
	     System.out.println(myChar.isDigit());
	     System.out.println(myChar.isAlphabet());
	     myChar.printUppercaseAlphabet();
	     myChar.printLowercaseAlphabet();
	}
}
