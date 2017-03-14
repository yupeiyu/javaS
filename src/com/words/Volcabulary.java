package com.words;

import java.util.Random;


public class Volcabulary {
	private static final String Random = null;
	
	static Enter en= new Enter();
	static String[] ans={"winter","summer","spring","forest","whale","shark","mermaid","pig","cat","dog"};
	static String[] que={"冬天","夏天","春天","森林","鯨魚","沙魚","美人魚","豬","貓","狗"};
	static String[] other={"fish","cloud","tiger ","ice cream ","tea","dream","flower","rain","lemon","wash"};
	static String[] other1={"lion","tissue","tiger ","water ","sun","pillow","apple","bus","nose","purse"};
	static String[] other2={"cream","mirror","box ","computer","cup","glass","window","paper","pencil","magnet"};
	int score=0;
	public static void main(String[] args) {
		System.out.println("請輸入你的名字: ");
		String name=en.enter();
		System.out.println("嗨! "+name+" 輸入1開始遊戲, 輸入2離開");
		
		int n=Integer.parseInt(en.enter());
		if(n==1){
		for(int i=0;i<que.length;i++){
		
			System.out.println(que[i]+"的英文? ");
			System.out.println("按1拼字回答，按2選擇題回答");
			
			int choose=Integer.parseInt(en.enter());
				switch(choose){
					case 1:
					System.out.println("拼出正確答案(全部小寫): ");
					if(en.enter().equals(ans[i])){
						en.addFive();
					}else{
						en.minus();
					}
					System.out.println("目前分數"+en.score);
					break;
					
					
				
			case 2:
				System.out.println("請選擇正確答案");
				String[]item={other[en.item()],other1[en.item()],ans[i],other2[en.item()]};
				System.out.println("1 "+item[0]+" "+"2 "+item[1]+" "+"3 "+item[2]+" "+"4 "+item[3]+" ");
						if(en.enter().equals("3")){
							en.addOne();
						}else{
							en.minus();
						}
						System.out.println("目前分數"+en.score);
						break;
				}
				continue;
			}
			
		}
		int total=en.score;
		System.out.println(name+" 的總分為: "+total);
		}
	}



