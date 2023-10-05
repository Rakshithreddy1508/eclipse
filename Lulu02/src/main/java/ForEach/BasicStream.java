package ForEach;

import java.util.ArrayList;

public class BasicStream {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> mycollection= new ArrayList<String>();

		mycollection.add("sahana");
		mycollection.add("Ajith");
		//mycollection.add("Harini");
		mycollection.add("Meghana");
		mycollection.add("Apoorva");

		//stream gets created ..??? foreach
		//mycollection.stream().forEach( x -> System.out.println(x));
//		Returns a sequential Stream with this collection as its source.

		mycollection.stream().filter(word -> word.length() < 6).forEach(x -> System.out.println(x));



	}
}