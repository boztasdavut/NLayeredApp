package Day3OdevDevam11.dataAccess;

import Day3OdevDevam11.entities.Category;
import Day3OdevDevam11.entities.Course;
import Day3OdevDevam11.entities.Instructor;

public interface BaseDao {
	void add(Course course);
	void add(Category category);
	void add(Instructor instructor);
	
	void delete(Course course);
	void delete(Category category);
	void delete(Instructor instructor);
	
	void update(Course course);
	void update(Category category);
	void update(Instructor instructor);

}
