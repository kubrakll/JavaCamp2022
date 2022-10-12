package ödev1;

public class CustomerManager {
	
	private Customer _customer;
	private ICreditManager _creditManager;
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer=customer;
		_creditManager=creditManager;
	}
	
	public void Save() {
		System.out.println("Müþteri Eklendi ");
	}

	public void Delete() {
		System.out.println("Müþteri Silindi ");

	}
	
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
	}

}
