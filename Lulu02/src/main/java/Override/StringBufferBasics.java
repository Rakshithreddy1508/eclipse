package Override;

public class StringBufferBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("My ");
		sb.append("Name ");
		sb.append("is ");
		sb.append("Rakshith");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.charAt(6));
		System.out.println(sb.hashCode());
		System.out.println(sb.length());
		System.out.println(sb.toString());

	}

}