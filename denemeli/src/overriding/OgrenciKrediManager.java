package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	
	//overridable - üzerine yazdık
	public double hesapla(double tutar) {

		return tutar * 1.10;
	}

}
