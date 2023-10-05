package CodingAssement;

import java.util.Objects;

public class AgeClass {
      int age;

      // gettere abd setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
 // para Constructor
	public AgeClass(int age) {
		super();
		this.age = age;
	}
 // Default Constructor
	public AgeClass() {
		super();
		// TODO Auto-generated constructor stub
	}
      // hash and equals

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgeClass other = (AgeClass) obj;
		return age == other.age;
	}
	// toString

	@Override
	public String toString() {
		return "LinkedList [age=" + age + "]";
	}
}
