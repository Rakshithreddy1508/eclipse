package ArrayCollections;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		ArrayList<Product> bucketProduct = new ArrayList<Product>();
		System.out.println(bucketProduct.size());
		Product p = new Product("Soap",50,10);
		Product p1 = new Product("waterbottel",150,10);
		 bucketProduct.add(p);
		 bucketProduct.add(p1);

		 bucketProduct.add(new Product("facecream",40,5));
		 bucketProduct.add(new Product("Cemara",4000,15));
		 bucketProduct.add(new Product("mobile",40000,25));
		 System.out.println(bucketProduct.size());
		 System.out.println("-------------------------------");

		 System.out.println(bucketProduct.indexOf(p1));
		 System.out.println(bucketProduct.clone());
		 System.out.println(bucketProduct.size());
		 System.out.println(bucketProduct.stream());


		 System.out.println("-------------------------------");
		 System.out.println("Records in the collection is ");
		 System.out.println(bucketProduct);

		 System.out.println();
		 for(Product m : bucketProduct) {
			 System.out.println(m);
		 }
	}

}
