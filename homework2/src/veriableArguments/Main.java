package veriableArguments;

public class Main {

	public static void main(String[] args) {
		/*
		 * Bazen fonksiyonumuza göndereceðimiz parametreler birden fazla olabilir ve biz
		 * bunun kaç tane olacaðýna emin olamýyorsak Variable Arguments yöntemi
		 * kullanabiliriz.
		 */
		int sum = toplam(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(sum);

	}

	public static int toplam(int... sayilar) {
		int toplam = 0;
		for (int Sayilar : sayilar) {
			toplam += Sayilar;
		}
		return toplam;
	}

}
