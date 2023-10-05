package lulubasics;

public class Vechile {

	int model;
	String brand;
	int speed;

	void start(){
		System.out.println("I will start Engine");

	}

	void stop(){
		System.out.println("I will Stop Vehicle");

	}

	void displayInfo(int m,String b,int s){
		//model = m;
		//brand = b;
		//speed = s;

		System.out.println("Model no is ="+m);
		System.out.println("Brand is ="+b);
		System.out.println("speed is "+s);


	}
}
