package com.fju.exam2;

public class NumberTool {
	int exclude;
	
	public NumberTool(int exclude){
		this.exclude = exclude;
	}
	
	public boolean contains(int number){
		String s = number+" ";
		boolean flag = false;
		for (int i=0; i<s.length(); i++){
			if ( s.charAt(i)==exclude ){
				flag = true;
				break;
			}
		}
		return flag;
	}
}
