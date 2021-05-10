package javaCampHwD5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampHwD5.business.abstracts.CustomerValidationService;
import javaCampHwD5.dataAccess.abstracts.CustomerDao;
import javaCampHwD5.entities.concretes.Customer;

public class CustomerValidationManager implements CustomerValidationService {
	
	private final String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	
	private CustomerDao customerDao;
	
	public CustomerValidationManager(CustomerDao customerDao) {
		this.customerDao= customerDao;
	}
	
	@Override
	public Boolean isRegistrationValid(Customer customer) {
		Boolean control = true ;
		
		control =isValid(
				this.passwordValid(customer),
				this.emailValid(customer),
				this.isEmailUsed(customer),
				this.isFirstNameAndLastNameValid(customer)
			);
		return control ;
	}

	
	@Override
	public Boolean isValid (Boolean... booleans ) {
		
		for (Boolean control : booleans) {
			if(control == false ) return control;
		}
		
		return true;
		
	}
	
	@Override
	public Boolean passwordValid(Customer customer) {
		Boolean control = false ;
		if(customer.getPassword().length()>5)	control = true;
		
		if(control == false)
			System.out.println("Password has to be least 6 characters");
		return control;
	}

	@Override
	public Boolean emailValid (Customer customer) {
		Boolean control = false ;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(customer.getEmail()); 
		control = matcher.matches();

		if(control == false)
			System.out.println("Invalid email");
		return control;
	}
	
	@Override
	public Boolean isEmailUsed  (Customer customer) {

		Boolean control = false ;
		control =  customerDao.isEmailUsed(customer.getEmail());
		if(control == false)
			System.out.println("Email already exists");
		
		return control;
		 
	}
	
	@Override
	public Boolean isFirstNameAndLastNameValid (Customer customer) {
		Boolean control = false;
		if(customer.getFirstName().length()>2 && customer.getLastName().length()>2 )
			control = true;
		if(control == false)
			System.out.println("FirstName and LastName have to be above 2 characters");
		return control;
	}
}
