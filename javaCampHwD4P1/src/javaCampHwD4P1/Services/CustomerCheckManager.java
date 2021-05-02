package javaCampHwD4P1.Services;

import javaCampHwD4P1.Entities.Customer;
import javaCampHwD4P1.Interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
  