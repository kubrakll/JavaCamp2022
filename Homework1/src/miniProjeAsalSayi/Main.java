package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// Asal Sayý sadece 1'e ve kendisine bölünebilen sayýdýr.

		int number = 99;
		boolean ýsItPrimaryNumber = true;
		if (number == 1) {
			System.out.println(number + " is Not Primary Number");

		}
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					ýsItPrimaryNumber = false;
				}
			}
			if (ýsItPrimaryNumber == true) {
				System.out.println(number + " is Primary Number");
			} else {
				System.out.println(number + " is Not Primary Number");
			}

		}
	}

}
