package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// Asal Say� sadece 1'e ve kendisine b�l�nebilen say�d�r.

		int number = 99;
		boolean �sItPrimaryNumber = true;
		if (number == 1) {
			System.out.println(number + " is Not Primary Number");

		}
		if (number > 1) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					�sItPrimaryNumber = false;
				}
			}
			if (�sItPrimaryNumber == true) {
				System.out.println(number + " is Primary Number");
			} else {
				System.out.println(number + " is Not Primary Number");
			}

		}
	}

}
