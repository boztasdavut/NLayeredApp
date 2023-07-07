package Day3OdevDevam11.core.logging;

import Day3OdevDevam11.entities.Category;
import Day3OdevDevam11.entities.Course;
import Day3OdevDevam11.entities.Instructor;

public class DatabaseLogger implements Logger{

	@Override
	public void logger(Instructor instructor) {
		System.out.println("instructor database'e loglandi: "+instructor.getInstructorName());
		
	}

	@Override
	public void logger(Category category) {
		System.out.println("kategori database'e loglandi: "+category.getCategoryName());
		
	}

	@Override
	public void logger(Course course) {
		System.out.println("kurs database'e loglandi: "+course.getCourseName());
		
	}
	

}
