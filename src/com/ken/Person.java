package com.ken;

import java.util.Random;

public class Person {
	String name;
	float weight;
	float height;
	public float bmi(){
		return weight/(height*height);
	}
	public Person(String n, float w, float h){
		height=h;
		weight=w;
		name=n;
	}
	public static void main(String[] args) { //解決
		Person a=new Person("Nina", 0, 0);
		
		Person b=new Person("Lisa", 0, 0);
		
		
		Person win = a.winner(b);
		if(win!=null){
			System.out.print(win.name);
		}else{
			System.out.print("平手");
		}
				
	}
	//設計
	private static int ken(){  //出拳
		return new Random().nextInt(3);
	}
	
	public Person winner(Person p){  //看誰贏
		int a=ken();
		int b=p.ken();
		System.out.println("Nina出 "+a+" Lisa出 "+b);
		Person who=null;
		if((a==0&&b==1)||(a==1&&b==2)||(a==2&&b==0)){
			who=this;
		}else if(a==b){
			who=null;
		}else{
			who=p;
		}
		
		return who;
	}

}
