package com.ken;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Maze map=new Maze(3,5);
		
		
		
		Player p=new Player();
		int dir=0;
		Scanner scanner=new Scanner(System.in);
		while(dir!=5){
			System.out.print("請輸入移動方向: ");
			String s=scanner.nextLine();
			dir=Integer.parseInt(s);
		
			switch(dir){
				case 8 :
					if(p.pos/map.col==0){
						p.wall();
					}else{
						p.pos=p.pos-map.col;
					}
					break;
				case 2 :
					if(p.pos/map.col==2){
						p.wall();
					}else{
						p.pos=p.pos+map.col;
					}
					break;
				case 4 :
					if(p.pos%map.col==0){
						p.wall();
					}else{
						p.pos=p.pos-1;
					}
					break;
				case 6 :
					if(p.pos%map.col==4){
						p.wall();
					}else{
						p.pos=p.pos+1;
					}
					break;
			}
			System.out.println("位置:"+p.pos+"/血: "+p.hp);
		}

	}

}
