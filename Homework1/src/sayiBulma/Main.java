package sayiBulma;

public class Main {

	public static void main(String[] args) {
		// Sayý Bulma
		// dizi tanýmla ve aranacak deðeri diziden bul
		int[] numbers = new int[] { 2, 4, 7, 34, 77 };
		int searchNumber = 17;
		boolean y = false;
		for (int i = 0; i < numbers.length; i++) {
			if (searchNumber == numbers[i])
				y = true;
		}
		if (y == true)
			System.out.println("number found");
		else
			System.out.println("number not found");

	}

}
