package Override;

public class Products extends Industry {
	 @Override
	void process() {
		 for(int i=1 ; i <= 100 ; i++) {
			 System.out.println(i);
		 }
	 }

}
