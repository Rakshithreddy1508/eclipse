package Assgiments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class BussinessLogic {


	ArrayList<EmployeeEntity> EM = new ArrayList<EmployeeEntity>();

	void businessLogic(){

		EM.add(new EmployeeEntity(222, "Rakshith", 22, 55000,"Software Developer"));
		EM.add(new EmployeeEntity(111, "Hari", 20, 70000,"Product Mangement"));
		EM.add(new EmployeeEntity(555, "Sagar", 25, 65000,"Retail "));
		EM.add(new EmployeeEntity(444, "Abhi", 18, 25000,"Devops Engineer"));
		EM.add(new EmployeeEntity(888, "Manoj", 32, 155000,"Site Engineer"));

		System.out.println("\n Displaying all the Records: ");
		for (EmployeeEntity e:EM) {
			System.out.println(e);

	   }

		/* List<EmployeeEntity> sortedList = EM.stream().sorted(Comparator.comparing(EmployeeEntity::getAge)).collect(Collectors.toList());
	      System.out.println("\n Sorted by Age:");
	      sortedList.forEach(System.out::println);
	      */

	      List<EmployeeEntity> sortedList = EM.stream()
	    		    .sorted(Comparator.comparing(EmployeeEntity::getId)) // Sort by id
	    		    .collect(Collectors.toList());
	      System.out.println("\n Sorted by ID:");
	      sortedList.forEach(System.out::println);
	}
}

