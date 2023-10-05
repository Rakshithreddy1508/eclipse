package lulubasics;

public class HrTester {

	public static void main(String[] args) {
		HrPortal hp = new HrPortal();
		hp.AddEmployee("Ravi", "Acc", 40000);
		HrPortal h1 = new HrPortal("Ravi", "Acc", 40000);
		h1.DisplayEmployee();

	}

}
