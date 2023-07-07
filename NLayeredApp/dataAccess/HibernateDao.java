package Day3OdevDevam11.dataAccess;

import Day3OdevDevam11.entities.Category;
import Day3OdevDevam11.entities.Course;
import Day3OdevDevam11.entities.Instructor;

public class HibernateDao implements BaseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate eklendi: "+course.getCourseName());
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate eklendi: "+category.getCategoryName());
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate eklendi: "+instructor.getInstructorName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate silindi: "+course.getCourseName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate silindi: "+category.getCategoryName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Hibernate silindi: "+instructor.getInstructorName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate guncellendi: "+course.getCourseName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate güncellendi: "+category.getCategoryName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Hibernate güncellendi: "+instructor.getInstructorName());
		
	}
	

}
