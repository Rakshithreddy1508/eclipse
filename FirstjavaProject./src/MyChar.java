
public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u' ) {
			return true;
		}

		return false;
	}

	public boolean isDigit() {
		if(ch>=48 && ch<=57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if(ch >= 'a' && ch<= 'z') {
			return true;
		}

		return false;
	}

	public static void printUppercaseAlphabet() {
     for(char ch = 'A';ch<='Z';ch++) {
    	 System.out.println(ch);
     }
	}

	public void printLowercaseAlphabet() {
		for(char ch = 'a';ch<='z';ch++) {
	    	 System.out.println(ch);
	     }
	}
}
