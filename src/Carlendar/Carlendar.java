package Carlendar;

import java.util.Scanner;

public class Carlendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		Scanner sc = new Scanner(System.in);
		String s = "    ";
		System.out.print("請輸入月:");
		int month = sc.nextInt();
		System.out.println("     日     " + "    一    " + "     二     " + "     三     " + "     四     " + "     五     " + "     六     ");
		data.data(month, s);
	}
}