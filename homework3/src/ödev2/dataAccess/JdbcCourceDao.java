package ödev2.dataAccess;

import ödev2.entities.Course;

public class JdbcCourceDao implements CourseDao{

	@Override
	public void Add(Course course) {
		System.out.println("Jdbc ile Kurs Eklendi");
		
	}

	@Override
	public void Delete(Course course) {
		System.out.println("Jdbc ile Kurs Silindi");
		
	}

}
