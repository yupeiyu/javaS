package com.fju.exam4;

import java.util.Random;

public class LimitThree {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[20];
		for (int i=0; i<20; i++){
			  numbers[i] = random.nextInt(10)+1;
			
		for(int j=0;j<20;j++){
			if(numbers[j]==numbers[i]){
				System.out.print(numbers[i]+"! ");
				break;
			}else{
			
			System.out.print(numbers[i]+" ");
			break;
		}
	
		}
		}
	}
}

