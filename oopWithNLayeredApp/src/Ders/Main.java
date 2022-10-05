package Ders;

import Ders.business.ProductManager;
import Ders.core.loging.DatabaseLogger;
import Ders.core.loging.FileLogger;
import Ders.core.loging.Logger;
import Ders.dataAccess.HibernateProductDal;
import Ders.dataAccess.JdbcProductDal;
import Ders.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1, "IPhone Xr", 10000);
		Logger[] loggers= {new DatabaseLogger(), new FileLogger()};
		
		ProductManager productManager= new ProductManager(new HibernateProductDal(),loggers);
		productManager.add(product1);
	}

}
