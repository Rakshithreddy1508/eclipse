package Synchronized;

public class Datas {

	void info() {
			//
			//

			///
			///
			synchronized (this) {

			System.out.println("resource 2");
				for (int i = 1; i <= 200; i++) {
					System.out.println(Thread.currentThread());
					// System.out.println("resource 2");
				}
			}
		}
	}	//Resource need to synchronized so that Only 1 thread aqcuire at a time
