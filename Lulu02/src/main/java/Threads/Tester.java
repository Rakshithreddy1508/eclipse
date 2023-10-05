package Threads;

/*public class Tester {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Threads are getting created by main() ");

			MyFirstThread th1= new MyFirstThread();
			th1.start();   // start() method will trigger run() internally
			//th1.run();
			//th1.checkAccess();
			//th1.getId();
			//th1.yield();

			System.out.println("All sorted well.....");

		}
	}
*/


public class Tester {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Threads are getting created by main() ");

		MyFirstThread th1= new MyFirstThread();
		th1.start();  // start() method will trigger run() internally

		MyFirstThread th2= new MyFirstThread();
		th2.start();  // start() method will trigger run() internally

		System.out.println("All sorted well.....");





	}



}
