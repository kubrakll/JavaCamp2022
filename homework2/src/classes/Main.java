package classes;

public class Main {

	public static void main(String[] args) {

		// Class = referance type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();

		// Referans Tip olay� �rnek
		Customer customer = new Customer();
		customer.name = "K�bra";

		Customer customer2 = new Customer();
		customer2.name = "K�l��";

		customer = customer2;
		customer2.name = "NewK�bra";

		System.out.println(customer.name);
		System.out.println(customer2.name);

	}

}
