package javaCampHwD3;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("Student added " +user.getUserName());
	}
	
	public void addMultiple(Student[] students) {
		for(Student student : students) {
			add(student);
		}
	}
	
	//Overriding
	public void getAllUsers(Student[] students) {
		for (Student student : students) {
			System.out.println("Öğrenci : " +student.getFirstName() + " " +student.getLastName());
		}
	}
	
}
