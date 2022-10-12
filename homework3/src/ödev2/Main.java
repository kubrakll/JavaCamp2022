package �dev2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import �dev2.business.CategoryManager;
import �dev2.business.CourseManager;
import �dev2.core.loging.DatabaseLogger;
import �dev2.core.loging.FileLogger;
import �dev2.core.loging.Logger;
import �dev2.dataAccess.HibernateCategoryDao;
import �dev2.dataAccess.JdbcCourceDao;
import �dev2.entities.Category;
import �dev2.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course = new Course();
		course.setCourseId(1);
		course.setCourseName("C#");
		course.setPrice(5000);

		Course course1 = new Course();
		course1.setCourseId(2);
		course1.setCourseName("JAVA");
		course1.setPrice(5000);
		
		/*
		 * Course course2 = new Course(); course2.setCourseId(2);
		 * course2.setCourseName("JAVA"); course2.setPrice(5000);
		 */

		Category category1 = new Category();
		category1.setCategoryId(1);
		category1.setCategoryName("Yaz�l�m");

		Category category2 = new Category();
		category2.setCategoryId(2);
		category2.setCategoryName("Programlama");

		
		/*
		 * Category category3 = new Category(); category3.setCategoryId(2);
		 * category3.setCategoryName("Yaz�l�m");
		 */

		Logger[] log = { new DatabaseLogger(), new FileLogger() };

		CourseManager courseManager = new CourseManager(new JdbcCourceDao(), log);
		courseManager.Add(course);

		System.out.println("*****************************************************");
		
		courseManager.Add(course1);

		System.out.println("*****************************************************");

		//courseManager.Add(course2);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), log);

		categoryManager.add(category1);
		System.out.println("*****************************************************");
		categoryManager.add(category2);

		// categoryManager.add(category3);
		System.out.println("*****************************************************");
	}

}
