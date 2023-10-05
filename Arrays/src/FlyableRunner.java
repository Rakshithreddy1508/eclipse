
	interface Flyable{
		void fly();
	}

	class Bird implements Flyable{

		@Override
		public void fly() {
     System.out.println("with Wings ");
		}
	}

	class Aeroplane  implements Flyable{

		@Override
		public void fly() {
			 System.out.println("with Fuel");
		}
	}



	public class FlyableRunner {

			public static void main(String[] args) {
		Flyable[] flyingobjects  = {new Bird(), new Aeroplane()};
		 for(Flyable object : flyingobjects) {
			 object.fly();
		 }
	}
}
