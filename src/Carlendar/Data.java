package Carlendar;

public class Data {

	static int k = 0;

	public static void print(int i) {

		k += 1;
		if (i < 10) {
			System.out.print("  " + i + " ");
		} else {
			System.out.print(" " + i + " ");
		}
		if (k % 7 == 0) {
			System.out.println();
		}
	}

	public void data(int month, String s) {
		if (month == 1) {
			System.out.print(s + s + s + s + s + "  1 " + "  2 ");
			System.out.println();
			for (int i = 3; i <= 31; i++) {
				print(i);
			}
		}
		if (month == 2) {
			System.out.print(s + "  1 " + "  2 " + "  3 " + "  4 " + "  5 " + "  6 ");
			System.out.println();
			for (int i = 7; i <= 29; i++) {
				print(i);
			}
		}
		if (month == 3) {
			System.out.print(s + s + "  1 " + "  2 " + "  3 " + "  4 " + "  5 ");
			System.out.println();
			for (int i = 6; i <= 31; i++) {
				print(i);
			}
		}
		if (month == 4) {
			System.out.print(s + s + s + s + s + "  1 " + "  2 ");
			System.out.println();
			for (int i = 3; i <= 30; i++) {
				print(i);
			}
		}
		if (month == 5) {
			System.out.print("  1 " + "  2 " + "  3 " + "  4 " + "  5 " + "  6 " + "  7 ");
			System.out.println();
			for (int i = 8; i <= 31; i++) {
				print(i);
			}
		}
		if (month == 6) {
			System.out.print(s + s + s + "  1 " + "  2 " + "  3 " + "  4 ");
			System.out.println();
			for (int i = 5; i <= 30; i++) {
				print(i);
			}
		}
		if (month == 7) {
			System.out.print(s + s + s + s + s + "  1 " + "  2 ");
			System.out.println();
			for (int i = 3; i <= 31; i++) {
				print(i);
			}
		}
		if (month == 8) {
			System.out.print("    " + "  1 " + "  2 " + "  3 " + "  4 " + "  5 " + "  6 ");
			System.out.println();
			for (int i = 7; i <= 31; i++) {
				print(i);
			}
		}
		if (month == 9) {
			System.out.print(s + s + s + s + "  1 " + "  2 " + "  3 ");
			System.out.println();
			for (int i = 4; i <= 30; i++) {
				print(i);
			}
		}
		if (month == 10) {
			System.out.print(s + s + s + s + s + s + "  1 ");
			System.out.println();
			for (int i = 2; i <= 31; i++) {
				print(i);
			}
		}
		if (month == 11) {
			System.out.print(s + s + "  1 " + "  2 " + "  3 " + "  4 " + "  5 ");
			System.out.println();
			for (int i = 6; i <= 30; i++) {
				print(i);
			}
		}
		if (month == 12) {
			System.out.print(s + s + s + s + "  1 " + "  2 " + "  3 ");
			System.out.println();
			for (int i = 4; i <= 31; i++) {
				print(i);
			}
		}
	}
}
