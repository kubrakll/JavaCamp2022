package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// �ki say� birbirinin kendisi hari� b�lenleri toplam�na e�itse bu say�lara
		// arkada� say�lar denir.
		// 220-284 arkada� say�d�r
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
