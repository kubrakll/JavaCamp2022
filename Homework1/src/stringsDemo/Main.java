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

		// Belirtilen harf kaçýncý indexte onu gösterir.Ýlk bulduðunu verir ve bitirir
		System.out.println(message.indexOf('T'));
		System.out.println(message.indexOf('t'));

		// Sondan aramaya baþlama
		System.out.println(message.lastIndexOf('T'));

		System.out.println("*******Diðer Ders********");

		// Boþluklarý deðiþme; ilk girdi deðiþmek istenen ikincisi neyle deðiþeceði
		System.out.println(message.replace(' ', '-'));

		// Metnin içerisinden parça alma
		System.out.println(message.substring(2));

		// iki parça arasý metini bölme
		System.out.println(message.substring(2, 5));

		// metini dizi gibi gösterme
		for (String word : message.split(" ")) {
			System.out.println(word);
		}

		// metini küçük harfe çevirme
		System.out.println(message.toLowerCase());

		// metini büyük harfe çevirme
		System.out.println(message.toUpperCase());

		// metinin baþýna ve sonuna boþluk býrakma
		System.out.println(message.trim());

	}

}
