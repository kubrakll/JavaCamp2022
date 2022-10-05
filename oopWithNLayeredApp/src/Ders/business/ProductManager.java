package Ders.business;

import java.util.List;

import Ders.core.loging.Logger;
import Ders.dataAccess.JdbcProductDal;
import Ders.dataAccess.ProductDal;
import Ders.entities.Product;

public class ProductManager {
	
	private ProductDal productDal;
	private Logger[] loggers;
	
	

	public ProductManager(ProductDal productDal, Logger[] loggers) {
		this.productDal = productDal;
		this.loggers=loggers;
	}


	public void add(Product product) throws Exception {

		// �� kurallar� yaz�l�r
		if(product.getUnitPrice()<10) {
			throw new Exception("�r�n fiyat� 10 dan k���k olamaz");
		}
		
		//ProductDal productdal=new JdbcProductDal();
		productDal.add(product);
		
		for (Logger logger : loggers) { //[db, mail]
			logger.log(product.getName());
		}

	}

}
