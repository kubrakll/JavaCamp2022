package overriding;

public class BaseKrediManager {

	public double hesapla(double tutar) {

		return tutar * 1.18;
	}

	// Kimse ezmesin istiy�rsak final anahtar kelimesi ile kullan�r�z.
	/*
	 * public final double hesapla(double tutar) {
	 * 
	 * return tutar * 1.18; }
	 */

}
