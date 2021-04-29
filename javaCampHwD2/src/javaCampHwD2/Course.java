package javaCampHwD2;

public class Course {
	
	int id;
	String courseName;
	Category category;
	Author author;
	
	public Course() {
		
	}
	
	public Course(int id, String courseName, Category category, Author author) {
		this.id=id;
		this.courseName=courseName;
		this.category=category;
		this.author=author;
	}

}
