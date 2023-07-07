package Day3OdevDevam11.core.logging;

import Day3OdevDevam11.entities.Category;
import Day3OdevDevam11.entities.Course;
import Day3OdevDevam11.entities.Instructor;

public interface Logger {
	void logger(Instructor instructor);
	void logger(Category category);
	void logger(Course course);
	

}
