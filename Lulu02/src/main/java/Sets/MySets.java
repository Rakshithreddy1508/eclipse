package Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class MySets {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//Sets..They donnt allow duplicates!

			//HashSet<String> bucketString= new HashSet<String>();
			//LinkedHashSet<String> bucketString= new LinkedHashSet<String>();
			TreeSet<String> bucketString= new TreeSet<String>();



			bucketString.add("Ram");
			bucketString.add("Abhi");
			bucketString.add("Dev");
			//bucketString.add(null);
			bucketString.add("Bhanu");
			bucketString.add("Car");
			bucketString.add("Ear");

			//System.out.println(bucketString.size());
			//System.out.println(bucketString);


			Iterator<String> iterator = bucketString.iterator();

			//System.out.println(iterator.hasNext());
			//System.out.println(iterator.next());
			//System.out.println(iterator.next());
			//System.out.println(iterator.next());
			//System.out.println(iterator.next());
			//System.out.println(iterator.next());

			while(iterator.hasNext()) {
				   // String element = iterator.next();
				    System.out.println( iterator.next() );
				}


		}


	}

