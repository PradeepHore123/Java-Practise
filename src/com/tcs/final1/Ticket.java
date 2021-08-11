package com.tcs.final1;

public class Ticket {
	private final String movie="ABC";
	private float price;
	
public final void sell(float s) {
	

}

class IllegalTicket extends Ticket{
public final void sell(String s) {//final can be overloadded 
	
}
}
}