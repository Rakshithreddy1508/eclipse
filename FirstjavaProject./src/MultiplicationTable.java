
public class MultiplicationTable {

	//public static void main(String[] args)
	void print() {
	  for(int i=1;i<=10;i++) {
		  System.out.printf("%d * %d = %d",6,i,6*i).println();
	  }

	}
	
	void print(int table) {
		  for(int i=1;i<=10;i++) {
			  System.out.printf("%d * %d = %d",table,i,table*i).println();
		  }

		}
	void print(int table,int from, int to) {
		  for(int i=from;i<=to;i++) {
			  System.out.printf("%d * %d = %d",table,i,table*i).println();
		  }

		}
}

