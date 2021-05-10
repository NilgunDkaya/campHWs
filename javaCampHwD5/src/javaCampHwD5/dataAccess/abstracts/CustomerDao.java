package javaCampHwD5.dataAccess.abstracts;

import java.util.List;

import javaCampHwD5.entities.concretes.Customer;

public interface CustomerDao {
	
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer findById(int id);
	Customer getByEmailAndPassword(String email, String password);
	List<Customer> getAll();
	Boolean isEmailUsed(String email);

}
