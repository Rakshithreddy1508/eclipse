package Assgiments;

public class Student {
	int RoolNo;
	String Name,address;



	public Student(int roolNo, String name, String address) {
		super();
		RoolNo = roolNo;
		Name = name;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoolNo() {
		return RoolNo;
	}
	public void setRoolNo(int roolNo) {
		RoolNo = roolNo;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [RoolNo=" + RoolNo + ", Name=" + Name + ", address=" + address + "]";
	}

}
