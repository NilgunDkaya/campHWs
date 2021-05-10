package javaCampHwD5.core;

import javaCampHwD5.business.abstracts.AuthService;
import javaCampHwD5.business.abstracts.CustomerService;
import javaCampHwD5.entities.concretes.Customer;
import javaCampHwD5.googleAuthentication.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	
	GoogleAuthManager auth = new GoogleAuthManager();
	
	private CustomerService customerService;
	
	public GoogleAuthManagerAdapter() { 
	}
	
	public GoogleAuthManagerAdapter(CustomerService customerService) { 
		this.customerService = customerService;
	}
	
	@Override
	public void login(String email, String password) {
		if(email == null || password == null ) {
			System.out.println("Email and password are required");
			return ;
		}
			
		Customer customer = customerService.getByEmailAndPassword(email, password);
		if(customer != null) {
			auth.login(email, password);
			return ;
		}
		System.out.println("Could not logged in by Google" +email);
	}

	@Override
	public void register(Customer customer) {
		if(customer != null){
			customerService.add(customer);
			auth.register(customer);
			return ;
		}
		System.out.println("Could not registered by Google");
	}

}
