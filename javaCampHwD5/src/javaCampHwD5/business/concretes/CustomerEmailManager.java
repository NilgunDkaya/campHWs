package javaCampHwD5.business.concretes;

import javaCampHwD5.business.abstracts.CustomerEmailService;

public class CustomerEmailManager implements CustomerEmailService{

	@Override
	public void sendEmail(String email, String message) {
		System.out.println("Mail sent : "+email+" \nMessage : "+message);
	}

}
