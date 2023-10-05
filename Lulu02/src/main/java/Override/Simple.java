package Override;

import java.util.StringTokenizer;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			   StringTokenizer st = new StringTokenizer("my name is RRR"," ");
			   //st="hello";  non valid
			   //st.append("ghgfhf") ; Not valid

			   int counter=0;
			            //true  //false
			     while (st.hasMoreTokens()) {
			    	 System.out.println(++counter);
			         System.out.println(st.nextToken());


	    }

	}

}

//public class GFG {

    // Main driver method
  //  public static void main(String args[])
//    {
        // Custom input string
//        String str = "aaaabbbbb cccccddddd aaaaa bbbbbccceeeee bbbbbgggg";
  //      String[] arrOfStr = str.split(" ");

//        for (String a : arrOfStr)
//            System.out.println(a);
//    }
//}