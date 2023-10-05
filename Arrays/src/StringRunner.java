
public class StringRunner {

	public static void main(String[] args) {
		String[] daysofWeek = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};

		String dayWithMostCharacter=" ";
		for(String day:daysofWeek) {
			if(day.length()>dayWithMostCharacter.length()) {
				dayWithMostCharacter = day;

			}
		}
		System.out.println("Day with most number of character  " + dayWithMostCharacter);

		for(int i =daysofWeek.length-1; i>0; i--) {
		System.out.println(daysofWeek[i]);
		}

		System.out.println("=======");

		for(int i=0; i<daysofWeek.length; i++) {
			System.out.println(daysofWeek[i]);
		}
	}

}
