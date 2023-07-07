package Day3OdevDevam11;

import Day3OdevDevam11.business.CategoryManager;
import Day3OdevDevam11.business.CourseManager;
import Day3OdevDevam11.core.logging.FileLogger;
import Day3OdevDevam11.core.logging.Logger;
import Day3OdevDevam11.core.logging.MailLogger;
import Day3OdevDevam11.dataAccess.HibernateDao;
import Day3OdevDevam11.dataAccess.JdbcDao;
import Day3OdevDevam11.entities.Category;
import Day3OdevDevam11.entities.Course;
import Day3OdevDevam11.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category = new Category();
		Instructor instructor = new Instructor();
		Course course1 = new Course();
		
		category.setCategoryId(1);
		category.setCategoryName("C#");
		
		Logger[] loggers = new Logger[] {new FileLogger(),new MailLogger()};
		CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers);
		categoryManager.category = category;
		categoryManager.add();
		
		Category category2 = new Category();
		category2.setCategoryId(12);
		category2.setCategoryName("Java");
		
		categoryManager.category = category2;
		categoryManager.add();
		
		
		
		
		
		
		
		
	}

}
