package ArrayCollections;

import java.util.Objects;

public class Product {

	String name;
	float price;
	double discount;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, float price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(discount, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Product other = (Product) obj;
		return Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount)
				&& Objects.equals(name, other.name) && Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}



}
