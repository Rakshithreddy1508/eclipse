package Strings_concept;

public class StringBuilderConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String -  not Modifiable -  new location new Storage
				//StringBuilder or StringBuffer - Both are Modifiable / Mutale
				   // try to them thy will allow on same stoarge in sied heap Arae.
				//StringBuilder sb1= " Hey All"; -- string
				// Dynamic ,can grwo as you add more content to it.....

				StringBuilder sb= new StringBuilder();
				System.out.println(sb.capacity());//16 //By default Size is 16
				sb.append("Hey All");
				sb.append(" How you all Doing ..!");

				System.out.println(sb);
				System.out.println(sb.capacity());
				System.out.println(sb.length());
				System.out.println(sb.charAt(8));
				System.out.println(sb.equals(sb));
				System.out.println(sb.hashCode());
				System.out.println(sb.deleteCharAt(9));
				System.out.println(sb.reverse());

		       // add 3 from your side


			}

	}


