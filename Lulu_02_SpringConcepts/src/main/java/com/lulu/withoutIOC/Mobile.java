package com.lulu.withoutIOC;
// Class
public class Mobile {



	// Main driver method
	public static void main(String[] args) {

		// Creating instance of Sim interface
		// inside main() method
		// with reference to Jio class constructor
		// invocation
		//Sim sim = new Jio();

       Sim sim = new Airtel();//objects Manually we creating
		sim.calling();
		sim.data();
	}
}