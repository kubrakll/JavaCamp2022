package overriding;

public class BaseKrediManager {

	public double hesapla(double tutar) {

		return tutar * 1.18;
	}

	// Kimse ezmesin istiyırsak final anahtar kelimesi ile kullanırız.
	/*
	 * public final double hesapla(double tutar) {
	 * 
	 * return tutar * 1.18; }
	 */

}
