package com.tcs.entity;


import java.util.ArrayList;
import java.util.List;

public class Gymnasium {
	
	static List<user> users=new ArrayList<user>();
	public static void main(String[] args) {
	createuser();
}
	private static void createuser() {
		for(int i=0;i<10;i++) {
			user u1 = new user();
			u1.setName("Ram"+i);
			u1.setAge((byte)(10*i));
			users.add(u1);
		}
		System.out.println(users);
		users.get(0).workout();
	}
}