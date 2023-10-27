package com.demo.LuLu_02_MS3_Shipping.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
	@Table(name="shipping")
	public class Shipping {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		int id;
		String shippingname;
		String shippingaddress;
		public int getId() {
			return id;

		}

		public void setId(int id) {
			this.id = id;

		}

		public String getShippingname() {
			return shippingname;

		}

		public void setComplaint(String complaint) {
			this.shippingname = complaint;

		}

		public String getShippingaddress() {
			return shippingaddress;

		}

		public void setShippingaddress(String shippingaddress) {
			this.shippingaddress = shippingaddress;

		}

		public Shipping() {
			super();

			// TODO Auto-generated constructor stub

		}

		public Shipping(int id, String shippingname, String shippingaddress) {

			super();
			this.id = id;
			this.shippingname = shippingname;
			this.shippingaddress = shippingaddress;

		}

		@Override
		public String toString() {
			return "Customercare [id=" + id + ", shippingname=" + shippingname + ", shippingaddress=" + shippingaddress+ "]";

		}

}