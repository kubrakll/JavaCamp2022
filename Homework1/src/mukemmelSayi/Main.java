package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// kendisi hari� pozitif tam b�lenlerinin toplam� kendisine e�it olan say�.
		// 6 --> 1,2,3 -->1+2+3=6

		int number = 28;
		double sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}

		}
		if (sum == number)
			System.out.println(number + " is perfect number");
		else
			System.out.println(number + " is not perfect number");
	}

}
