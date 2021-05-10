package javaCampHwD5.business.abstracts;

import java.util.List;

import javaCampHwD5.entities.concretes.Customer;

public interface CustomerService {
	
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	//void verify(int id);
	Customer findById(int id);
	//Customer getByEmailAndPassword(String email, String password);
	List<Customer> getAll();
	Customer getByEmailAndPassword(String email, String password);
}
