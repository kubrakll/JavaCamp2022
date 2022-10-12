package ödev2.business;

import java.util.ArrayList;
import java.util.List;

import ödev2.core.loging.Logger;
import ödev2.dataAccess.CourseDao;
import ödev2.entities.Category;
import ödev2.entities.Course;

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
			throw new Exception("Kurs fiyatý'dan küçük olamaz");
		}
		for (Course cs : courses) {
			if (cs.getCourseName().equalsIgnoreCase(cource.getCourseName())) {
				throw new Exception("Bir kurslar listesinde ayný isimden iki adet olamaz!");
			}

		}
		courses.add(cource);
		_courseDao.Add(cource);
	
		for (Logger logger : _loggers) {
			logger.log(cource.getCourseName());
		}
		
	}

}
