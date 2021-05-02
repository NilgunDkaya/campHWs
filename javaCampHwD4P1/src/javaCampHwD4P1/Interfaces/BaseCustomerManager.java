package javaCampHwD4P1.Interfaces;

import javaCampHwD4P1.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " +customer.getFirstName());
	}

}
