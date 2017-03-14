package com.words;

import java.util.Random;
import java.util.Scanner;

public class Enter {
	int score=0;
	public int item(){
		Random r=new Random();
		int it=r.nextInt(9)+1;
		return it;
	}
	public String enter(){
		Scanner scanner = new Scanner(System.in);
		String s=scanner.nextLine();
		return s;
	}
	
	public int addFive(){
		score=score+5;
		return score;
		
		
	}
	public int addOne(){
		score=score+1;
		return score;
	}
	public int minus(){
		score=score-3;
		return score;
	}
}
