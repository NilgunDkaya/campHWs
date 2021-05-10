package javaCampHwD5.business.concretes;

import java.util.List;

import javaCampHwD5.business.abstracts.CustomerService;
import javaCampHwD5.dataAccess.abstracts.CustomerDao;
import javaCampHwD5.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void add(Customer customer) {
		customerDao.add(customer);
		
	}

	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
		
	}
	
	@Override
	public Customer findById(int id) {
		Customer customer = customerDao.findById(id);
		return customer;
	}
	
	@Override
	public List<Customer> getAll() {
		return customerDao.getAll();
	}
 
	
//	@Override
//	public void verify(int id) {
//		Customer customer = customerDao.findById(id);
//		customer.setIsVerified(true);
//		System.out.println("Customer verification is successful");
//	}

	@Override
	public Customer getByEmailAndPassword(String email, String password) {
		Customer customer = customerDao.getByEmailAndPassword(email, password);
		if( customer == null)
			System.out.println("Customer not found ");
		return customer;
	}

}
