package Carlendar;
import java.util.Scanner;
public class Calendar2017 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2017 data2017 = new Data2017();
		Scanner sc = new Scanner(System.in);
		String s = "    ";
		System.out.print("今年2017年，請輸入月:");
		int month = sc.nextInt();
		System.out.println("      日     " + "     一    " + "     二     " + "     三     " + "     四     " + "     五     " + "     六     ");
		data2017.data2017(month, s);
	}
}
