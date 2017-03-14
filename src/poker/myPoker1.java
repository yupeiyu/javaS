package poker;

public class myPoker1 {

	public static void main(String[] args) {
		//聰明版
		String[] flowers={"C","D","H","s"};
		int[] cards= new int[52];
		for(int i=0;i<cards.length;i++){
			System.out.print((i%13)+1+flowers[i/13]+"");
			if(i%13==12)
				System.out.println();//換行
		}

	}

}
