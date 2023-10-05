package lulubasics;

public class VechileTester {

	public static void main(String[] args) {
		//obect
		Vechile v= new Vechile();

		//access the features
		v.start();
		v.displayInfo(12098, "Suzuki", 150); //int m,String b,int s  model,brand,speed
		v.stop();

	}
}

