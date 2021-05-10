package javaCampHwD5.business.concretes;

import javaCampHwD5.business.abstracts.AuthService;
import javaCampHwD5.business.abstracts.CustomerEmailService;
import javaCampHwD5.business.abstracts.CustomerService;
import javaCampHwD5.business.abstracts.CustomerValidationService;
import javaCampHwD5.entities.concretes.Customer;

public class AuthManager implements AuthService{
	
	private CustomerService customerService;
	private CustomerEmailService customerEmailService;
	private CustomerValidationService customerValidationService;
	
	public AuthManager(CustomerService customerService, 
				CustomerEmailService customerEmailService, 
				CustomerValidationService customerValidationService) {
		this.customerService = customerService;
		this.customerEmailService = customerEmailService;
		this.customerValidationService = customerValidationService;
	}
	
	@Override
	public void login(String email, String password) {
		if(email == null || password == null ) {
			System.out.println(" Email and password are required");
			return ;
		}
			
		Customer customer = customerService.getByEmailAndPassword(email, password);
		if(customer == null ) {

			System.out.println(email +" could not logged in");
			return ;
		}
		customerEmailService.sendEmail(customer.getEmail(), " successfully logged in");
		System.out.println(customer.getFirstName() +" successfully logged in");
		
	}
	
	@Override
	public void register(Customer customer) {
		
		Boolean control = true ;
		control = customerValidationService.isRegistrationValid(customer);
		
		if(control) {
			System.out.println(customer.getFirstName() +" successfully registered");
			customerService.add(customer);
			customerEmailService.sendEmail(customer.getEmail(), " successfully registered");
			return;
		}
		
		System.out.println(customer.getFirstName() +" could not registered");
		customerEmailService.sendEmail(customer.getEmail(), " could not registered");
	}
	
	

}
