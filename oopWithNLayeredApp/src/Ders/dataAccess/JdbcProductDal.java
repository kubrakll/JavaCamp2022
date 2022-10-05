package Ders.dataAccess;

import Ders.entities.Product;

public class JdbcProductDal implements ProductDal{

	public void add(Product product) {
		
		//sadece ve sadece db eriþim kodlarý buraya yazýlýr..
		//SQL
		System.out.println("JDBS ile veritabanýna eklendi");
		
	}
}


