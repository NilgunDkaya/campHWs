package javaCampHwD3;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println("Instructor added " +user.getUserName());
	}
	
	public void addMultiple(Instructor[] instructors) {
		for(Instructor instructor : instructors) {
			add(instructor);
		}
	}
	
	//Overriding
	public void getAllUsers(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("Instructor : " +instructor.getFirstName() + " " +instructor.getLastName());
		}
	}
	
}
