package com.learn.java.deepcloning;

public class Student implements Cloneable {
	String name;
	int roll;
	Address addr;
	Student(){
		
	}
Student(String name,int roll,Address addr){
	this.name=name;
	this.roll=roll;
	this.addr=addr;
}
public String toString() {
	return this.name+" "+this.roll+" "+this.addr;
}

public Object clone() throws CloneNotSupportedException {
	Student dummystd = (Student) super.clone();//create dummy copy of Student using clone
	Address address= (Address)addr.clone();//also create copy of Address
	dummystd.addr=address;//assign address copy to dummy student  object
	return dummystd;//return dummy Student
}
}