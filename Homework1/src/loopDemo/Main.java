package loopDemo;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");

		/*
		 * Tek Sayýlar for (int i = 1; i <= 10; i += 2) { System.out.println(i); }
		 * System.out.println("For Döngüsü Bitti");
		 */
		/*
		 * Çift Sayýlar for (int i = 2; i <= 10; i += 2) { System.out.println(i); }
		 * System.out.println("For Döngüsü Bitti");
		 */

		// While
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");

		// do-while
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);
		System.out.println("do-while Döngüsü Bitti");

	}

}
