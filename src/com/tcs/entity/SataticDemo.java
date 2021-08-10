package com.tcs.entity;

public class SataticDemo {
	public static void main(String[] args){
		Bank bank= new Bank();
		System.out.println(Bank.createNewAccountNumber());
		Bank bank1= new Bank();
		System.out.println(Bank.createNewAccountNumber());
	}
}
class Bank{
	static int counter;
	public static int createNewAccountNumber() {
		return ++counter;
		
	}
	
}
