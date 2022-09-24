package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] numbers = new int[] { 2, 4, 7, 34, 77 };
		int searchNumber = 7;
		boolean y = false;
		for (int i = 0; i < numbers.length; i++) {
			if (searchNumber == numbers[i])
				y = true;
		}
		if (y == true) {
			System.out.println(mesajVer(y));
		} else
			System.out.println("number not found");
	}

	public static String mesajVer(boolean k) {
		String a="number found";
		return a;
	}

}
