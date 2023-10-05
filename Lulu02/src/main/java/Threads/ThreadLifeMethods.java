package Threads;

public class ThreadLifeMethods extends Thread {


	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("thread "+Thread.currentThread().getName());

			try {
				Thread.sleep(2000);//time in ms ,thread sleeps for 2000ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}


 

}
}