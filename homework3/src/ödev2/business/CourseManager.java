package �dev2.business;

import java.util.ArrayList;
import java.util.List;

import �dev2.core.loging.Logger;
import �dev2.dataAccess.CourseDao;
import �dev2.entities.Category;
import �dev2.entities.Course;

public class CourseManager {
	
	private CourseDao _courseDao;
	private Logger[]  _loggers;
	public List<Course> courses=new ArrayList<Course>();
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		_courseDao=courseDao;
		_loggers=loggers;
	}
	 
	public void Add(Course cource) throws Exception {
		
		if(cource.getPrice()<0) {
			throw new Exception("Kurs fiyat�'dan k���k olamaz");
		}
		for (Course cs : courses) {
			if (cs.getCourseName().equalsIgnoreCase(cource.getCourseName())) {
				throw new Exception("Bir kurslar listesinde ayn� isimden iki adet olamaz!");
			}

		}
		courses.add(cource);
		_courseDao.Add(cource);
	
		for (Logger logger : _loggers) {
			logger.log(cource.getCourseName());
		}
		
	}

}
