package com.lulu.exception;

public class EceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//syntax error -grammar based / sytax based error that compiler identifies
		int data ;

		//exception
		// Abnormal code in class that creates
		 //abrupt termnation of progran while execution is going on.
		        //exception types
// 		             --checked exceptions(compile exceotion) -
// 		             --unchecked exception (runtime exception)

		int no1=10;
		int no2=0;

		System.out.println("Process started");
		int no3 = 0;
		 try {
	            no3 = no1 / no2;
	            System.out.println(no3);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	            //e.printStackTrace();
	        }

		System.out.println("successful !");
	}

}
