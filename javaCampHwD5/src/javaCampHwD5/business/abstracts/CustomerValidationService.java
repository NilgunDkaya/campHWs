package javaCampHwD5.business.abstracts;

import javaCampHwD5.entities.concretes.Customer;

public interface CustomerValidationService {
	Boolean isRegistrationValid(Customer customer);
	Boolean isValid (Boolean... booleans);
	Boolean passwordValid(Customer customer);
	Boolean emailValid (Customer customer);
	Boolean isEmailUsed  (Customer customer);
	Boolean isFirstNameAndLastNameValid (Customer customer);

}
