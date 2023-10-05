package CodingAssement;

public class Totalamountsi {

	public static void main(String[] args) {
		double SI;
		int T = 9;
		float R=8.5f;
		float P= 40000;

		SI =P*T*R/100;

		System.out.println("SI charged ="+ SI);
		double Total = SI +P;

		System.out.println();

		Double bd = (double) Total;
		System.out.println("Total Amount is ="+ bd.longValue());

	}

}
