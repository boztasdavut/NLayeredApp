package Day3OdevDevam11.entities;

public class Course {
	private String courseName;
	private int courseId;
	private int courseDuration;
	private int courseQuota;
	private Instructor courseInstructor;
	private Category courseCategory;
	private double coursePrice;

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public int getCourseQuota() {
		return courseQuota;
	}

	public void setCourseQuota(int courseQuota) {
		this.courseQuota = courseQuota;
	}

	public Instructor getCourseInstructor() {
		this.courseInstructor.setInstructorName("asd");
		return courseInstructor;
	}

	public void setCourseInstructor(Instructor courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	public Category getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(Category courseCategory) {
		this.courseCategory = courseCategory;
	}

}
