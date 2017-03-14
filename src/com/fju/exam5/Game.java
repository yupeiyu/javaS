package com.fju.exam5;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Player jack = new Player("Jack");
		TrapMap map = new TrapMap(3, 5);
		map.print(jack);
		jack.print();
		//請與以下設計程式
		int dir=0;
		Scanner scanner=new Scanner(System.in);
		while(dir!=5){
			System.out.print("請輸入移動方向: ");
			String s=scanner.nextLine();
			dir=Integer.parseInt(s);
		
			switch(dir){
				case 8 :
					jack.position=jack.position-3;
					map.print(jack);
					if(map.isTrap(jack.position)){
						jack.hp=jack.hp-30;
					}
					jack.print();
					break;
				case 2 :
					jack.position=jack.position+3;
					map.print(jack);
					if(map.isTrap(jack.position)){
						jack.hp=jack.hp-30;
					}
					jack.print();
					break;
				case 4 :
					jack.position=jack.position-1;
					map.print(jack);
					if(map.isTrap(jack.position)){
						jack.hp=jack.hp-30;
					}
					jack.print();
					break;				
				case 6 :
					jack.position=jack.position+1;
					map.print(jack);
					if(map.isTrap(jack.position)){
						jack.hp=jack.hp-30;
					}
					jack.print();
					break;					
			}
		
	}
	}
}

