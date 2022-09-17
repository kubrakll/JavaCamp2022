package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara
		// arkadaş sayılar denir.
		// 220-284 arkadaş sayıdır
		int number1=220;
		int number2=284;
		double sum1=0;
		double sum2=0;
		for(int i=1;i<number1;i++) {
			if(number1%i==0)
				sum1=sum1+i;	
		}
		for(int i=1;i<number2;i++) {
			if(number2%i==0)
				sum2=sum2+i;	
		}
		if(sum1==number2 && sum2==number1)
			System.out.println("Friends number");
		else
			System.out.println("not friends number");
	}

}
