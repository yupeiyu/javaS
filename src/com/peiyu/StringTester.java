package com.peiyu;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     
       Person p = new Person();//cue Person 類別
       p.name="Tommy";
       p.weight=60;
       p.height=1.6f;
       System.out.print(p.bmi());
	}

}
