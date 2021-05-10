package javaCampHwD5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javaCampHwD5.dataAccess.abstracts.CustomerDao;
import javaCampHwD5.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	
	List<Customer> customers = new ArrayList<Customer>(); 

	
	
	@Override
	public void add(Customer customer) {
		System.out.println("Customer added");
		customers.add(customer);
	}

	@Override
	public void update(Customer customer) {
		Customer updatedCustomer = findById(customer.getId());
		if(updatedCustomer == null) {
			System.out.println("Customer not found. Could not updated");
			return;
		}
		System.out.println("Customer updated");
		updatedCustomer.setFirstName(customer.getFirstName());
		updatedCustomer.setLastName(customer.getLastName());
		updatedCustomer.setEmail(customer.getEmail());
		updatedCustomer.setPassword(customer.getPassword());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer deleted");
		customers.removeIf(c -> c.getId() == customer.getId());
	}

	@Override
	public Customer findById(int id) {
		for(Customer customer : customers) {
			if(customer.getId() == id )
				return customer;
		}
		return null;
	}

	@Override
	public Customer getByEmailAndPassword(String email, String password) {
		for (Customer customer : customers) {
			if(customer.getEmail() == email && customer.getPassword() == password)
				return customer;
		}
		return null;
	}

	@Override
	public Boolean isEmailUsed(String email) {
		Boolean control = true;
		for (Customer customer : customers) {
			if(customer.getEmail().equals(email))
				control = false;
		}
		return control;
	}
	
	@Override
	public List<Customer> getAll() {
		return customers;
	}

	

}
