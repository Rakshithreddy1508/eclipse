package lulubasics;

public class SimpleInterest {

	public static void main(String[] args) {



		double SI;
		int N =20;
		float R=8.5f;
		float P= 50000;

		SI =P*N*R/100;

		System.out.println("SI charged ="+ SI);
		double Total = SI +P;

		System.out.println();

		Double bd = (double) Total;
		System.out.println("Total Amount is ="+ bd.longValue());




	}

}
