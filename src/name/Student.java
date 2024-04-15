package com.tns.SerializationDemo;

import java.io.Serializable;

public class Student implements Serializable {
	private int sid;
	private String name;
	private double score;
	private transient long phone;
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", score=" + score + ", phone=" + phone + "]";
	}
	public Student(int sid, String name, double score, long phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.score = score;
		this.phone = phone;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	
}
