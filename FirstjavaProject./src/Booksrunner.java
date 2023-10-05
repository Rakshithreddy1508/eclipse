
public class Booksrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Books effectivejava = new Books ();
       Books artofcomputerprogramming = new Books();
       Books cleancode = new Books();

       effectivejava.setNoofcopies(1) ;
       artofcomputerprogramming.setNoofcopies (30);
       cleancode.setNoofcopies (60) ;

       effectivejava.increaseNoofcopies(500) ;
       artofcomputerprogramming.increaseNoofcopies(100);
       cleancode.increaseNoofcopies(100) ;



       System.out.println("effectivejava.getNoofcopies()");
       System.out.println("artofcomputerprogramming.getNoofcopies()");
       System.out.println("cleancode.getNoofcopies()");
	}
}
