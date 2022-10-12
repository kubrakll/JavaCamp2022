package �dev2.business;

import java.util.ArrayList;
import java.util.List;

import �dev2.core.loging.Logger;
import �dev2.dataAccess.CategoryDao;
import �dev2.entities.Category;

public class CategoryManager {

	private CategoryDao _categoryDao;
	private Logger[] _loggers;

	public List<Category> categories=new ArrayList<Category>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		_categoryDao = categoryDao;
		_loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category ct : categories) {
			if (ct.getCategoryName().equalsIgnoreCase(category.getCategoryName())) {
				throw new Exception("Bir kategori listesinde ayn� isimden iki adet olamaz!");
			}

		}
		categories.add(category);
		_categoryDao.add(category);
		
		for (Logger logger : _loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
