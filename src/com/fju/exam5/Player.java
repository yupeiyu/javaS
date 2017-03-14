package com.fju.exam5;

public class Player {
	String name;
	int hp = 100;
	int position = 0;
	
	public Player(String name){
		this.name = name;
	}
	
	public void print(){
		System.out.println("玩家名稱:"+name+"  hp:"+hp +"  位置:"+position);
	}
}
