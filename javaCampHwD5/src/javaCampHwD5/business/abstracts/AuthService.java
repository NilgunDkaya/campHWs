package javaCampHwD5.business.abstracts;

import javaCampHwD5.entities.concretes.Customer;

public interface AuthService {
	
	void login(String email, String password);
	void register(Customer customer);

}
