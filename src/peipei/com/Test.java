package peipei.com;
//�|�ˤ��J�p�ƲĤG��
import java.text.DecimalFormat;
public class Test {

	public static void main(String[] args) {
		double n=1.29685;
		DecimalFormat df=new DecimalFormat("#.##");
		System.out.print(df.format(n));
	}


}
