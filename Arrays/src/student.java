import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class student {

	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public student(String name , int... marks) {
		for(int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getnumberofmarks() {
		return marks.size();
	}

	public int getsumofmarks() {
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
				return sum;
	}

	public int getmaximummark() {
		int maximum = Integer.MIN_VALUE;
		for(int mark: marks) {
			if(mark > maximum) {
			   maximum = mark;
		}
		   }
				return maximum;
	}

	public int getminimummark() {
		int minimum = Integer.MAX_VALUE;
		for(int mark: marks) {
			if(mark < minimum) {
			   minimum = mark;
		}
		   }
				return minimum;
	}

	public BigDecimal getAverageMark(){
		int sum = getsumofmarks();
		int Number = getnumberofmarks();
		return new BigDecimal(sum).divide(new BigDecimal(Number),3,RoundingMode.UP) ;
	 }


}

