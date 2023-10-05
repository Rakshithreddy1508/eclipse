package Maps;

import java.util.Hashtable;

public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Key  Value Pair
		//Two Objects needed K -V
//		Map<k,V>
		//add() not there , put() will help to add elements
		//duplicate Keys not allowed

		Hashtable<Integer, String> bucketMap= new Hashtable<Integer,String>();  // Null Cann,t  accepted
		//HashMap<Integer, String> bucketMap= new HashMap<Integer,String>();  // Null Can  be accepted
		//TreeMap<Integer, String> bucketMap= new TreeMap<Integer,String>();  // Null Cann,t  accepted

		bucketMap.put(111, "Sahana");
		bucketMap.put(222, "Meghana");
		bucketMap.put(333, "Apoorva");
		bucketMap.put(444, "Ajith");
		bucketMap.put(555, "Shravya");
		//bucketMap.put(null,"Nagasree");//overrite
		bucketMap.put(222, "RRR");//overrite
		bucketMap.put(777, "time");
		bucketMap.put(888, "ccc");
		bucketMap.put(000, "S");

		//System.out.println(bucketMap);
		System.out.println(bucketMap.get(000));
		System.out.println(bucketMap.isEmpty());
		System.out.println(bucketMap.size());
		System.out.println(bucketMap.remove(222));
		//System.out.println(bucketMap.firstEntry());
		//System.out.println(bucketMap.lastEntry());
		System.out.println(bucketMap.containsKey(000));
		System.out.println(bucketMap.hashCode());



		//////////////////////////////////Lets create Entry to Iterate Over/////

	//	for(Entry<Integer, String> entrys : bucketMap.entrySet()) {
		//System.out.println(entrys);
		//System.out.println(entrys.getKey()  +" :::"+entrys.getValue());
		  //    if(entrys.getKey()==222) {
		    //  System.out.println("Congratulations "+entrys.getValue()) ;
		   }
		//}
	}
//}


