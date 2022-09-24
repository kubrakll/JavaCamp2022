package methods2;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 13;
		String mesaj = "Hello Kübra";
		System.out.println(sayisaldön(sayi1, sayi2));
		System.out.println(metindön(mesaj));
		degerdön();

	}

	public static void degerdön() {
		System.out.println("Void döndürme");
		// return;
	}

	public static String metindön(String mesaj) {
		return mesaj;
	}

	public static int sayisaldön(int n1, int n2) {
		return n1 + n2;
	}

}
