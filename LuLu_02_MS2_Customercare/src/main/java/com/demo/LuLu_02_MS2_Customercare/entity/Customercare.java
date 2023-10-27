package com.demo.LuLu_02_MS2_Customercare.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customercare")
public class Customercare {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int id;
	String complaint;
	String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customercare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customercare(int id, String complaint, String status) {
		super();
		this.id = id;
		this.complaint = complaint;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Customercare [id=" + id + ", complaint=" + complaint + ", status=" + status + "]";
	}
}