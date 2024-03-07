package com.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Payment 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_id;
	private String payment_type;
	private int payment_amount;
	private Date payment_date;
	
	@ManyToOne()
	Student student;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int payment_id, String payment_type, int payment_amount, Date payment_date, Student student) {
		super();
		this.payment_id = payment_id;
		this.payment_type = payment_type;
		this.payment_amount = payment_amount;
		this.payment_date = payment_date;
		this.student = student;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public int getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(int payment_amount) {
		this.payment_amount = payment_amount;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", payment_type=" + payment_type + ", payment_amount="
				+ payment_amount + ", payment_date=" + payment_date + ", student=" + student + "]";
}
}