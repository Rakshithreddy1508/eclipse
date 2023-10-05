package Synchronized;

public class ResourceTwo {

	 synchronized static void processtwo() {

		System.out.println("resource 2");



		 for(int i=1;i<=200;i++) {

			 System.out.println(Thread.currentThread());

			 //System.out.println("resource 2");

			 }

	}



}


