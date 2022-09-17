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

		// Belirtilen harf ka��nc� indexte onu g�sterir.�lk buldu�unu verir ve bitirir
		System.out.println(message.indexOf('T'));
		System.out.println(message.indexOf('t'));

		// Sondan aramaya ba�lama
		System.out.println(message.lastIndexOf('T'));

		System.out.println("*******Di�er Ders********");

		// Bo�luklar� de�i�me; ilk girdi de�i�mek istenen ikincisi neyle de�i�ece�i
		System.out.println(message.replace(' ', '-'));

		// Metnin i�erisinden par�a alma
		System.out.println(message.substring(2));

		// iki par�a aras� metini b�lme
		System.out.println(message.substring(2, 5));

		// metini dizi gibi g�sterme
		for (String word : message.split(" ")) {
			System.out.println(word);
		}

		// metini k���k harfe �evirme
		System.out.println(message.toLowerCase());

		// metini b�y�k harfe �evirme
		System.out.println(message.toUpperCase());

		// metinin ba��na ve sonuna bo�luk b�rakma
		System.out.println(message.trim());

	}

}
