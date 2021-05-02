package javaCampHwD4P1.Services;

import javaCampHwD4P1.Entities.Customer;
import javaCampHwD4P1.Interfaces.BaseCustomerManager;
import javaCampHwD4P1.Interfaces.CustomerCheckService;

public class NeroCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Customer successfully added");
			super.save(customer);
		}
		else {
			System.out.println("Validation went wrong. Customer couldn't add");
		}
		
	}

}
