package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is sunny today";
		System.out.println(message);

		// Eleman say�s� verme
		System.out.println("Number of elements: " + message.length());

		// istenilen eleman� g�rme
		System.out.println("5. element: " + message.charAt(4));

		// mesaja metin ekleme
		System.out.println(message.concat(" ! yeap"));

		System.out.println(message);

		// B ile ba�lama durumu ilk harfi kontrol etme do�ruysa T, yanl��sa F
		// K���k-b�y�k harf duyarl�d�r
		System.out.println(message.startsWith("B"));

		// y ile bitme durumu ilk harfi kontrol etme do�ruysa T, yanl��sa F
		System.out.println(message.endsWith("y"));

		char[] k = new char[5];
		message.getChars(0, 4, k, 0);
		System.out.println(k);

	}

}
