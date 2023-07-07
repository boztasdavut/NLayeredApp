package Day3OdevDevam11.business;

import java.util.ArrayList;

import Day3OdevDevam11.core.logging.Logger;
import Day3OdevDevam11.dataAccess.BaseDao;
import Day3OdevDevam11.entities.Course;

public class CourseManager implements BaseManager{
	ArrayList<String> courseNames = new ArrayList<String>();
	BaseDao baseDao;
	public Course course;
	Logger[] loggers;
	public CourseManager(BaseDao baseDao) {
		this.course = course;
		this.baseDao = baseDao;
	}
	@Override
	public void add() throws Exception {
		if(courseNames.contains(course.getCourseName())) {
			throw new Exception("Ayni ismi içeren bir kurs zaten mevcut.!");
		}
		courseNames.add(course.getCourseName());
		baseDao.add(course);
		for(Logger logger: loggers) {
			logger.logger(course);
		}
	}

	@Override
	public void delete() {
		baseDao.delete(course);
		
	}

	@Override
	public void update() {
		baseDao.update(course);
		
	}
	

}
