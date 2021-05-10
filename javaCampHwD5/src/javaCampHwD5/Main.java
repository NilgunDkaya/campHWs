package javaCampHwD5;

import javaCampHwD5.business.abstracts.AuthService;
import javaCampHwD5.business.abstracts.CustomerEmailService;
import javaCampHwD5.business.abstracts.CustomerService;
import javaCampHwD5.business.abstracts.CustomerValidationService;
import javaCampHwD5.business.concretes.AuthManager;
import javaCampHwD5.business.concretes.CustomerEmailManager;
import javaCampHwD5.business.concretes.CustomerManager;
import javaCampHwD5.business.concretes.CustomerValidationManager;
import javaCampHwD5.core.GoogleAuthManagerAdapter;
import javaCampHwD5.dataAccess.abstracts.CustomerDao;
import javaCampHwD5.dataAccess.concretes.HibernateCustomerDao;
import javaCampHwD5.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Ali", "Demir", "alidemir@gmail.com", "ali123");
		Customer customer2 = new Customer(2, "Ayse", "Demir", "aysedemir@gmail.com", "ayse123");
		Customer customer3 = new Customer(3, "Veli", "Demir", "velidemir@gmail.com", "veli123");
		Customer customer4 = new Customer(4, "Aysu", "Demir", "aysudemir@gmail.com", "aysu123");
		Customer customer5 = new Customer(5, "Ahmet", "Demir", "ahmetdemir@gmail.com", "ahmet123");
		
		CustomerDao customerDao = new HibernateCustomerDao();
		
		CustomerService customerService = new CustomerManager(customerDao);
		CustomerEmailService customerEmailService = new CustomerEmailManager();
		CustomerValidationService customerValidationService = new CustomerValidationManager(customerDao);
		
		AuthService authService = new AuthManager(customerService,customerEmailService,customerValidationService );
		
		System.out.println("-------------------------------------");
		
		authService.register(customer1);
		authService.register(customer2);
		authService.register(customer3);

		System.out.println("-------------------------------------");
		
		authService.login("alidemir@gmail.com", "ali1234");
		authService.login("alidemir@gmail.com", "ali123");
		
		System.out.println("-------------------------------------");
		
		authService = new GoogleAuthManagerAdapter(customerService);
		
		authService.register(customer4);
		authService.register(customer5);

		System.out.println("-------------------------------------");

		authService.login(null, null);
		authService.login(null, "123");
		authService.login("aa", null);
		authService.login("aysudemir@gmail.com", "aysu1234");
		authService.login("aysudemir@gmail.com", "aysu123");
		
		customerService.getAll().forEach(c->System.out.println(c.getEmail()));
	}

}
