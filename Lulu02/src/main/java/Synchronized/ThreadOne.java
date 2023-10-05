package Synchronized;

public class ThreadOne extends Thread{



	@Override
	public void run() {



		ResourceTwo.processtwo();

	}



}