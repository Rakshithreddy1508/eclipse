package Threads;

public class TesterInterfcae {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Thread 

		System.out.println("Main Thread"+Thread.currentThread().getName());
//Runnable 
		MySecondThread mst= new MySecondThread();
		Thread t1=new Thread(mst);//additional step
		t1.start();// trigger run() method 

		MyFirstThread th1= new MyFirstThread();
		th1.start();  // start() method will trigger run() internally

		MyFirstThread th2= new MyFirstThread();
		th2.start();  // start() method will trigger run() internally


 

		
	}

 

}