package methods2;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 13;
		String mesaj = "Hello K�bra";
		System.out.println(sayisald�n(sayi1, sayi2));
		System.out.println(metind�n(mesaj));
		degerd�n();

	}

	public static void degerd�n() {
		System.out.println("Void d�nd�rme");
		// return;
	}

	public static String metind�n(String mesaj) {
		return mesaj;
	}

	public static int sayisald�n(int n1, int n2) {
		return n1 + n2;
	}

}
