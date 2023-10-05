package Exception;

public class BussinessLogic {

	void checkEligibility(int age) throws MyException {
		if(age >=18) {
			System.out.println("You can Vote");
		}else {
			///problemetic situation
			throw new MyException("ppl having age below 18 cant vote");
			//explicitely throw the Objects
		}

  }
}