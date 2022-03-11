package com.learn.java.deepcloning;

public class Address implements Cloneable{
String city;
String state;
int pinCode;

Address(){
	
}
Address(String city,String state,int pin ){
	this.city=city;
	this.state=state;
	this.pinCode=pin;
}
public String toString() {
	return this.city+" "+this.state+" "+this.pinCode;
}
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}
