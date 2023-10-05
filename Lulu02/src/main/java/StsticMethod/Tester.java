package StsticMethod;

public class Tester {
	public static void main(String[] args) {
		StaticMethods.info();// static methods can
        //be accessed by Directly class name
        //No need of creating Objects

		//StaticMethods.hello();

      StaticMethods sm= new StaticMethods();//Object is Must
      sm.hello();
      StaticMethods sm2= new StaticMethods();//Object is Must
      sm2.hello();


			//static is class copy only
			//non static is objects

}

	}


