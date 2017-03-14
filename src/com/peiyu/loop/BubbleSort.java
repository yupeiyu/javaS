package com.peiyu.loop;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n={3,1,5,2,4};
		
		for(int i=0;i<=3;i++){
			for(int j=i+1;i<=4;j++){
				if(n[i]>n[j]){
					int tmp=n[i];
					n[i]=n[j];
					n[j]=tmp;
				}
			}
			
		}
		for(int i=0;i<5;i++){
			System.out.println(n[i]);
		}
	}

}
