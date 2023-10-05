package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoreCheckedAvailable {


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//Scanner Class
		//BuffereReader Class

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter some information");

		String info =br.readLine();  //Checked exception So
		                              //Throws key to manage
		System.out.println("YOu have entered "+ info) ;

	}
}