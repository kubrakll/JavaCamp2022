package conditionals;

public class Main {

	public static void main(String[] args) {
		/*
		 * Defensive programming, �ng�r�lemeyen ko�ullara yaz�l�msal olarak �nlem almak
		 * i�in kulland���m�z tekniklerdir.
		 */
		int sayi = 24;
		if (sayi < 20) {
			System.out.println("Sayi 20'den k���kt�r.");
		} else if (sayi == 20) {
			System.out.println("Say� 20'ye e�ittir.");
		} else {
			System.out.println("Sayi 20'den b�y�kt�r.");
		}

	}

}
