package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.
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
