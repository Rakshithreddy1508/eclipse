package CodingAssement;

public class SchoolRecords {

	String name ;         //School Name
	String  location;    //School Address
	int id ;		   // School id

	 void addrecords(String sn , String l , int i) {
		 name = sn;
		 location = l;
		 id = i;
		 System.out.println("School Records Added");
	 }
	 void DisplayRecords() {

		    System.out.println("School Name is: " +name);
			System.out.println("School Location is: " +location);
			System.out.println("School id is: " +id);
	 }
}
