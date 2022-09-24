package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.set_id(1);
		product.set_name("Laptop");
		product.set_description("Asus Laptop");
		product.set_price(5999);
		product.set_stockAmoýnt(4);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.get_kod());
		//System.out.println(product.name);

	}

}
