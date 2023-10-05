package Strings_concept;

public class MyString {

	String info="I m first String"; // Instance Variable
	static int no;
	// Instance Varuiable + static = > static or class variable

	void process() {
	//	String data; // Local Variable

		//I / O family

	//	Scanner sc= new Scanner( System.in);
	//	System.out.println("Hey user eneter 1 String !!!!!");
		//data= sc.next();

	//	System.out.println("I got data as = "+data);
		//System.out.println("I got info as ="+info );

	}

    public void understandMethods() {

		String name="My name is RRR"; // String Pool
		String name2= new String("My name is Reddy");  // Heap - JVM - JRE- JDK

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(12));
		System.out.println(name.contains("RRR")); //True or False
		System.out.println(name.equals(name2)); //false
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name2.charAt(9));

		//next 3 methods...at your level...




	}




}

