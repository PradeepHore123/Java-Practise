package com.tcs.entity;

public class user {
	private String name;
	private Long mobileNumber;
	private byte age;
	public user(String name, Long mobileNumber, byte age) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
	}
	public void workout() {
		System.out.println(name+"is working out");

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "user [name=" + name + ", mobileNumber=" + mobileNumber + ", age=" + age + "]";
	}
	
}
