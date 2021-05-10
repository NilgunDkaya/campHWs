package javaCampHwD5.googleAuthentication;

import javaCampHwD5.entities.abstracts.Entity;
import javaCampHwD5.entities.concretes.Customer;

public class GoogleAuthManager {
	
	public void register(Customer customer) {
		
   	 System.out.println("Successfully registered by google account" + customer.getEmail());
    }
	
    public void login(String email,String password) {
		if(email == null && password == null ) {
			System.out.println(" Email and password are required");
			return ;
		}
    	System.out.println("Successfully logged in by google account" + email);
    }

}
