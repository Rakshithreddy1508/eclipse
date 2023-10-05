package Threads;

public class TesterTh {

	public static void main(String[] args) {


		ThreadLifeMethods t1=new ThreadLifeMethods();
		ThreadLifeMethods t2=new ThreadLifeMethods();
		t1.setPriority(Thread.MAX_PRIORITY);//10

		t1.setName("Lulu1");
		t2.setName("Lulu2");
		System.out.println("is is alive t1 :"+t1.isAlive());

		t1.start();
		System.out.println("is is alive t1 :"+t1.isAlive());
//		t1.run();

		t2.start();
		t1.getPriority(); ///Norm -5
		System.out.println(t1.getPriority());
		//t1.stop();start();
		}
	}



