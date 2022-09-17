package conditionals;

public class Main {

	public static void main(String[] args) {
		/*
		 * Defensive programming, öngörülemeyen koþullara yazýlýmsal olarak önlem almak
		 * için kullandýðýmýz tekniklerdir.
		 */
		int sayi = 24;
		if (sayi < 20) {
			System.out.println("Sayi 20'den küçüktür.");
		} else if (sayi == 20) {
			System.out.println("Sayý 20'ye eþittir.");
		} else {
			System.out.println("Sayi 20'den büyüktür.");
		}

	}

}
