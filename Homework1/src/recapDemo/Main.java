package recapDemo;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		// Video algoritma
		int enBuyuk = 26;
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük = " + enBuyuk);

		// Benim algoritma
		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("En büyük sayi :" + sayi1);
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("En büyük sayi :" + sayi2);
		} else if (sayi3 > sayi1 && sayi3 > sayi1) {
			System.out.println("En büyük sayi :" + sayi3);
		} else {
			if (sayi1 == sayi2 || sayi1 == sayi3 || sayi2 == sayi3) {
				System.out.println("Eþit Sayýlar var");
			}
		}

	}

}
