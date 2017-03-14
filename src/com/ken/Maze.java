package com.ken;

import java.util.Random;

public class Maze {
	Random random=new Random();
	int row;
	int col;
	int[] monsters;//不定隻怪獸寫法，再建一個建構子，多一個屬性
	public Maze(int col, int row){
		this.row=row;
		this.col=col;
		int[] map=new int[col*row];
	}
	public Maze(int col, int row, int numofMonsters){
		this.row=row;
		this.col=col;
		monsters=new int[numofMonsters];
		for(int i=0;i<numofMonsters;i++){
			monsters[i]=random.nextInt(col*row);
		}
	}
	

	public boolean up(int pos){
		boolean ok= (pos/col)!=0;
		return ok;
	}

}
