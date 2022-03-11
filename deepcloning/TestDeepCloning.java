package com.learn.java.deepcloning;

public class TestDeepCloning {

public static void main(String[] args) throws CloneNotSupportedException {
	Address a1=new Address("Pune","Maharastra",1234);
	Student s1= new Student("Ram",10,a1);
	System.out.println("Original(S1):"+s1);
	Student s2= (Student) s1.clone();
	System.out.println("Cloned (S2):"+s2);
	s1.addr.city="Mumbai";
	System.out.println("After Change Original(s1):"+s1);
	System.out.println("After Change Cloned(s2):"+s2);
	System.out.println("S1 hashcode="+s1.hashCode()+ "s1-address hashcode="+s1.addr.hashCode());
	System.out.println("S2 hashcode="+s2.hashCode()+ "s2-address hashcode="+s2.addr.hashCode());
	
}
}
