package com.fju.exam5;

import java.util.Random;

public class TrapMap {
	int row;
	int col;
	int[] pos;
	int numOfTraps = 5;
	
	public TrapMap(int row, int col){
		this.row = row;
		this.col = col;
		Random random = new Random();
		pos = new int[col*row];
		for (int i=0; i<numOfTraps; i++){
			int trap = random.nextInt(row*col);
			pos[trap] = 9;
			System.out.println("Trap:" + trap);
		}
	}
	
	public boolean isTrap(int position){
		if ( pos[position] == 9){
			return true;
		}
		return false;
	}
	
	public void print(Player player){
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				int p = i*col+j;
				System.out.print(" ");
				if (player.position == p)
					System.out.print("P");
				else if (pos[p]==9)
					System.out.print("*");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
