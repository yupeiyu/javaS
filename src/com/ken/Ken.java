package com.ken;

import java.util.Random;

public class Ken {

	public static void main(String[] args) {
		Random r=new Random();
		//0=stone; 1=scissor;2=paper
		int a = r.nextInt(3);
		int b= r.nextInt(3); //3=3個變數
		System.out.println("A出 "+a+" B出 "+b);
	
	switch(a){
		case 0:
			if(b==1){
				System.out.print("A贏");
			}else if(b==2){
				System.out.print("B贏");
			}else{
				System.out.print("平手");
			}
			break;
		case 1:
			if(b==1){
				System.out.print("平手");
			}else if(b==2){
				System.out.print("A贏");
			}else{
				System.out.print("B贏");
			}
			break;
		case 2:
			if(b==1){
				System.out.print("B贏");
			}else if(b==2){
				System.out.print("平手");
			}else{
				System.out.print("A贏");
			}
			break;
	}
	
	}
}
