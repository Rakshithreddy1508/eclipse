package Exception;

public class DrivingVehicleChecker {
	
	void eligibilityAge(int age) {
		if(age>=18) {
			System.out.println("valid");
		}else {
			System.out.println("Age validating");
			throw new ValidException("In valid age must be 18 for driving");
		}
		
	}

}
