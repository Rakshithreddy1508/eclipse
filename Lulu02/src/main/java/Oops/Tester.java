package Oops;

public class Tester {

	public static void main(String[] args) {
		Child c = new Child();
		c.attitude();
		c.attitude(123);

		System.out.println();

		Parent p = new Parent();
		p.attitude();
		p.attitude(333);

	}

}
