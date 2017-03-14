package peipei.com;
import java.util.Random;
public class Try {

//兩顆相同~成功!

		public static void main(String[] args) {
			Random r = new Random();
			int n1 = r.nextInt(6) + 1;
			int n2 = r.nextInt(6) + 1;
			int n3 = r.nextInt(6) + 1;
			int n4 = r.nextInt(6) + 1;

			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + "\t");
			
			if(n1==n2&&n3==n4){
				System.out.println("四顆皆同");
			}else if(n1==n2&&n3!=n4&&n1==n3){
				System.out.println("三顆相同");
			}else if(n1==n2&&n3!=n4&&n1==n4){
				System.out.println("三顆相同");
			}else if(n2==n3&&n4!=n1&&n2==n4){
				System.out.println("三顆相同");
			}
			else if(n1==n3&&n4!=n2&&n1==n4){
				System.out.println("三顆相同");
			}else if(n1!=n3&&n4!=n2&&n1!=n4&&n1!=n2&&n2!=n3&&n3!=n4){
				System.out.println("四顆皆異");
			}else{
				System.out.println("Dice Pair");
			}
				
		}
		
		}

