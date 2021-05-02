

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import javaCampHwD4P1.Adapters.MernisServiceAdapter;
import javaCampHwD4P1.Entities.Customer;
import javaCampHwD4P1.Interfaces.BaseCustomerManager;
import javaCampHwD4P1.Interfaces.CustomerCheckService;
import javaCampHwD4P1.Services.CustomerCheckManager;
import javaCampHwD4P1.Services.NeroCustomerManager;
import javaCampHwD4P1.Services.StarbuksCustomerManager;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer(1,"Engin","Demiroð",new Date(1985,1,6),"31634390762");
		Customer customer2 = new Customer(2,"Nilgün","Demirkaya",new Date(1996,10,5) ,"15896512685");

		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(customer1);
		
		BaseCustomerManager starbucksCustomerManager = new StarbuksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer1);
		starbucksCustomerManager.save(customer2);
		
	}

}
