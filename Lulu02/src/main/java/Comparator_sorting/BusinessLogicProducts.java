package Comparator_sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessLogicProducts {

	ArrayList<Product> productbucket= new ArrayList<Product>();

	void addProcucts() {

		//bucket and will add Product Objects
		Product p1=new Product(111, "tracks", 700);
 		productbucket.add(p1);
 		productbucket.add(new Product(222, "shoes", 2500));
 		productbucket.add(new Product(333, "t-shirts", 800));
 		productbucket.add(new Product(444, "bag", 1800));
 		productbucket.add(new Product(01, "waterbottel", 500));
 		productbucket.add(new Product(332, "travelbag", 4800));

 		System.out.println("prduct on our catalogue "+productbucket.size());


	}

	void showProducts() {
		//for
		//enhanced for
		//stream for each

		productbucket.stream().forEach((k) ->System.out.println(k + " "));

		//sort comparator comparable wont be using
		//stream -sorting based Object -inbuilt
		System.out.println();
		System.out.println("sorting going on");

		 /* List<Product> sortedProducts =
				 productbucket.stream().sorted(Comparator.comparing(Product::getCost)).collect(Collectors.toList());
			*/

	/*	List<Product> sortedProducts =
			    productbucket.stream().sorted(Comparator.comparing(Product::getId)).collect(Collectors.toList());
		*/

		List<Product> sortedProducts =
			    productbucket.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
		 sortedProducts.stream().forEach((k) ->System.out.println(k + " "));
	}

}


