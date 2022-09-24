package classes;

public class Main {

	public static void main(String[] args) {

		// Class = referance type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();

		// Referans Tip olayý örnek
		Customer customer = new Customer();
		customer.name = "Kübra";

		Customer customer2 = new Customer();
		customer2.name = "Kýlýç";

		customer = customer2;
		customer2.name = "NewKübra";

		System.out.println(customer.name);
		System.out.println(customer2.name);

	}

}
