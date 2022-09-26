package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalcurator womanGameCalcurator=new WomanGameCalcurator();
		womanGameCalcurator.hesapla();
		womanGameCalcurator.gameOver();
		
		//abstract class'lar new lenemez...
		GameCalculator gameCalculator=new WomanGameCalcurator();
		
		
	}

}
