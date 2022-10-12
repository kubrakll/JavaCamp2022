package ödev1;

public abstract class BaseCrediManager implements ICreditManager{
	
	public abstract void Calculate();
	
	public void Save() {
		System.out.println("Kaydedildi");
	}
	

}
