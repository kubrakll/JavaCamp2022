package �dev2.dataAccess;

import �dev2.entities.Course;

public class HibernateCourceDao implements CourseDao{

	@Override
	public void Add(Course course) {
		System.out.println("Hibernate ile Kurs Eklendi");
		
	}

	@Override
	public void Delete(Course course) {
		System.out.println("Hibernate ile Kurs Silindi");
		
	}

}
 