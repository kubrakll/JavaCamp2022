package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	
	//overridable - �zerine yazd�k
	public double hesapla(double tutar) {

		return tutar * 1.10;
	}

}
