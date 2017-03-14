package com.peiyu.array;

import java.util.Random;

public class Lotery539 {

	public static void main(String[] args) {
		Random r=new Random();
		int n[]=new int[5]; //5個數字
		for(int i=0;i<5;i++){
			n[i]=r.nextInt(5)+1;
			
			int [] kongs=new int[5];
			kongs[n[i]]=1;//坑放1
			while(kongs[n[i]]==1){ //如果坑有1就無止境一直產生新亂數
				n[i]=r.nextInt(5)+1;
			}
			System.out.print(n[i]+" ");
		}
	
	}

}
