package ArrayCollections;

import java.util.Scanner;


public class a {

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter a n value: ");
    int n = sc.nextInt();

    	if(n%2==0) {
    		if(n>0 && n<=5) {
				System.out.println("Not Wired");
			} else if(n>=5 && n<=20) {
				System.out.println("Wired");
			} else {
				System.out.println("Not Wired");
			}
			} else {
			System.out.println("Wired");
		}

    	  }
    }







