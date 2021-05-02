package javaCampHwD4P2.Services;

import javaCampHwD4P2.Entities.User;
import javaCampHwD4P2.Interfaces.UserService;
import javaCampHwD4P2.Interfaces.UserValidationService;

public class UserManager implements UserService{
	
	private UserValidationService userValidationService;
	
	public UserManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(User user) {
		if(userValidationService.isValid(user)) {
			System.out.println("User added : " +user.getUserName());
		}
		else {
			System.out.println("User couldn't add. Validation went wrong");
		}
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted : " +user.getUserName());
	}

	@Override
	public void update(User user) {
		System.out.println("User updated : " +user.getUserName());
	}

}
