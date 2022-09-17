package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is sunny today";
		System.out.println(message);

		// Eleman sayýsý verme
		System.out.println("Number of elements: " + message.length());

		// istenilen elemaný görme
		System.out.println("5. element: " + message.charAt(4));

		// mesaja metin ekleme
		System.out.println(message.concat(" ! yeap"));

		System.out.println(message);

		// B ile baþlama durumu ilk harfi kontrol etme doðruysa T, yanlýþsa F
		// Küçük-büyük harf duyarlýdýr
		System.out.println(message.startsWith("B"));

		// y ile bitme durumu ilk harfi kontrol etme doðruysa T, yanlýþsa F
		System.out.println(message.endsWith("y"));

		char[] k = new char[5];
		message.getChars(0, 4, k, 0);
		System.out.println(k);

	}

}
