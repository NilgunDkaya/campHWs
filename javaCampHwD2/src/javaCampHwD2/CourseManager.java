package javaCampHwD2;

public class CourseManager {
	
	public void addCourse(Course course) {
		System.out.println("Course added : " +course.courseName);
	}
	
	public void getAllCourses(Course[] courses) {
		
		for (Course course : courses) {
			System.out.println("Course : " +course.courseName);
		}
	}

}
