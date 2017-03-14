package com.ken;

public class BmiTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person("Nina",55f,1.6f);
		//p.name="Nina";
		//p.weight=55;
		//p.height=1.6f;
		System.out.print(p.name+"的bmi:"+p.bmi());
	}

}
