package Threads;

public class MySecondThread implements Runnable{


	@Override
	public void run() {

	for (int i = 1; i <= 50; i++) {
	System.out.println("I m thread by Runnable Interface " + i);
	System.out.println("current thread "+ Thread.currentThread().getName());



		}

	}





}