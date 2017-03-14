package com.fju.exam1;

public class Sequential {

	public static void main(String[] args) {
		for (int i=1; i<=200; i++){
			String s = i+" ";
			boolean flag = false;
			for (int j=0; j<s.length(); j++){
				if (s.charAt(j)=='4'){
					flag = true;
					break;					
				}else{
					
				}
				
			}
			System.out.print(s+" ");
		}
	}

}
