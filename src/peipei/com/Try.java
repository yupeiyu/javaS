package peipei.com;
import java.util.Random;
public class Try {

//�����ۦP~���\!

		public static void main(String[] args) {
			Random r = new Random();
			int n1 = r.nextInt(6) + 1;
			int n2 = r.nextInt(6) + 1;
			int n3 = r.nextInt(6) + 1;
			int n4 = r.nextInt(6) + 1;

			System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + "\t");
			
			if(n1==n2&&n3==n4){
				System.out.println("�|���ҦP");
			}else if(n1==n2&&n3!=n4&&n1==n3){
				System.out.println("�T���ۦP");
			}else if(n1==n2&&n3!=n4&&n1==n4){
				System.out.println("�T���ۦP");
			}else if(n2==n3&&n4!=n1&&n2==n4){
				System.out.println("�T���ۦP");
			}
			else if(n1==n3&&n4!=n2&&n1==n4){
				System.out.println("�T���ۦP");
			}else if(n1!=n3&&n4!=n2&&n1!=n4&&n1!=n2&&n2!=n3&&n3!=n4){
				System.out.println("�|���Ҳ�");
			}else{
				System.out.println("Dice Pair");
			}
				
		}
		
		}

