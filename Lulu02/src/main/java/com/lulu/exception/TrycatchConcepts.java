package com.lulu.exception;

public class TrycatchConcepts {


	public static void main(String[] args) {
		// TODO Auto-generated method stu

		try {
		}catch(Exception e) {

		}finally {

		}

		//////////////////////////////////

		try {
			System.out.println("data here");
			int data[] = new int[5];
			data[0]=10;
			data[1]=20;
			data[2]=30;
			System.out.println("we here");
			data[3]=40;
			data[4]=50;
			data[5]=60;
		}finally {


		}

////////////////////////////////////////////

		try {

		}catch(ArithmeticException e) {

		}catch(ArrayIndexOutOfBoundsException e) {

		}

		//////////////////////////////




		try {

		}catch(ArithmeticException e) {

		}catch(ArrayIndexOutOfBoundsException e) {

		}finally {


		}

		//////nesting/////////
		try {

			try {

			}catch(ArithmeticException e){

			}

		}catch(ArithmeticException e) {

		}catch(ArrayIndexOutOfBoundsException e) {

		}finally {


		}
		////////////////////////////////////////

		try {

		}finally {

		}
		//*/catch(ArrayIndexOutOfBoundsException e) {

		}



}