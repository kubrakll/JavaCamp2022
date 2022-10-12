package ödev2.dataAccess;

import ödev2.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile Kategori Eklendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile Kategori Silindi");
		
	}

}
