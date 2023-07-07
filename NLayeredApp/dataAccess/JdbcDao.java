package Day3OdevDevam11.dataAccess;

import Day3OdevDevam11.entities.Category;
import Day3OdevDevam11.entities.Course;
import Day3OdevDevam11.entities.Instructor;

public class JdbcDao implements BaseDao{

	public void add(Course course) {
		System.out.println("Hibernate eklendi: "+course.getCourseName());
		
	}

	@Override
	public void add(Category category) {
		System.out.println("JDBC eklendi: "+category.getCategoryName());
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC eklendi: "+instructor.getInstructorName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC silindi: "+course.getCourseName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC silindi: "+category.getCategoryName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("JDBC silindi: "+instructor.getInstructorName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("JDBC guncellendi: "+course.getCourseName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC güncellendi: "+category.getCategoryName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("JDBC güncellendi: "+instructor.getInstructorName());
		
	}
	

}
