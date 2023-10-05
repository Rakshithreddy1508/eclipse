package Synchronized;

public class Threads extends 
Thread {
	Datas d;

	public Threads(Datas d) {
		
		this.d = d;
	}

	public void run() {
		d.info();

	}

}

