package com.ken;

public class Player {
	int pos=0;
	int hp=100;
	public void wall(){
		System.out.print("咚");
		hp=hp-10;
	}
}
