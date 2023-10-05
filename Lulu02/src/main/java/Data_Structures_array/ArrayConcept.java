package Data_Structures_array;

public class ArrayConcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array Declared
		int data[] = new int [5];

		//Initialize
		//0 1 2 3 4 5
		//static // dynamic initialization ?????

		data[0]=11;
		data[1]=22;
		data[2]=33;
		data[3]=44;
		data[4]=55;

		//data[5]=66;

		//for

		//Processing
		//add mul reshufle sorting quee stack sorting searching

		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]);

		data[4]=data[3]+ data[3];
		System.out.println("upgrated result is ="+ data[4]);

		data[4]=data[3] * data[3];
		System.out.println("upgrated result is ="+ data[4]);

		// iterrate process

		for(int i=0;i<data.length;i++) {

			//display
			//swap
			//searching
			//Manupulation
			//Max
			//min
			//delete

			System.out.println("counter value "+ i);
			System.out.println(data[i]);
		}
            // enhancedc loop
		System.out.println();
		System.out.println("enhanced for loop result");
		 for(int info:data) {
			 System.out.println(info);
		 }

	}
}
