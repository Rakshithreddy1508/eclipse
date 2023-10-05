package Threads;

public class TesterInterfcae1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Thread

		System.out.println("Main Thread"+Thread.currentThread().getName());
//Runnable
		MySecondThread mst= new MySecondThread();
		Thread t1=new Thread(mst);//additional step
		t1.start();// trigger run() method

	 }
		}

