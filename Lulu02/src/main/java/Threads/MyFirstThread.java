package Threads;

/*public class MyFirstThread extends Thread{


	@Override
	public void run() {  // we trying to override -
		for(int i=1; i<=10; i++) {
			System.out.println("I m thread "+i);

     		}

		}
}
*/


public class MyFirstThread extends Thread {

	@Override
	public void run() { // we trying to override -
		for (int i = 1; i <= 50; i++) {
			System.out.println("I m thread " + i);
			System.out.println("current thread "+ Thread.currentThread());

		}
	}

}
