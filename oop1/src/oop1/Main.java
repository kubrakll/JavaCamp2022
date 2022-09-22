package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oraný";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		// set value (okuma)
		//.
		/*
		 * product1.name = "Delonghi Kahve Makinesi"; product1.unitPrice = 7500;
		 * product1.discount = 7; product1.unitsInStock = 3; product1.imageUrl =
		 * "bilmemne.jpg";
		 */
		// get value (yazma) System.out.println(product1.name);
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");
		/*
		 * product2.name = "Smeg Kahve Makinesi"; product2.unitPrice = 6500;
		 * product2.discount = 8; product2.unitsInStock = 4; product2.imageUrl =
		 * "bilmemne1.jpg";
		 */
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");
		/*
		 * product3.name = "Kitchen Aid Kahve Makinesi"; product3.unitPrice = 4500;
		 * product3.discount = 9; product3.unitsInStock = 5; product3.imageUrl =
		 * "bilmemne2.jpg";
		 */
		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}
		/*
		 * // HTML System.out.println("ul"); for (Product product : products) {
		 * System.out.println("<li>" + product.name + "</li>"); }
		 * System.out.println("/ul"); // HTML SON
		 * 
		 */

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0555");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Kübra");
		individualCustomer.setLastName("Kýlýç");
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama,io");
		corporateCustomer.setPhone("3767628");
		corporateCustomer.setTaxNumber("111");
		corporateCustomer.setCustomerNumber("4");
	}

}
