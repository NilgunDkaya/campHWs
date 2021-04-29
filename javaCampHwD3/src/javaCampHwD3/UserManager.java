package javaCampHwD3;


public class UserManager {

	public void login(User user) {
		System.out.println("Successfully logged in " + user.getUserName());
	}
	
	public void logout(User user) {
		System.out.println("Successfully logged out " + user.getUserName());
	}
	
	public void delete(User user) {
		System.out.println("Account successfully deleted");
	}
	
	public void getAllUsers(User[] users) {
		for (User user : users) {
			System.out.println("User's name and surname is : " +user.getFirstName() + " " +user.getLastName());
		}
	} 
	
}
