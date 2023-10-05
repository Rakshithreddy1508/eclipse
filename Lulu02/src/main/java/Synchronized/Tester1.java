package Synchronized;

public class Tester1 {

	 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Datas dataobj= new Datas();

Threads t1= new Threads(dataobj);

t1.start();

 

Threads t2= new Threads(dataobj);

t2.start();

	}

 

}