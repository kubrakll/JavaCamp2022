package ödev2.dataAccess;

import ödev2.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile Kategori Eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Jdbc ile Kategori Silindi");
		
	}

}
