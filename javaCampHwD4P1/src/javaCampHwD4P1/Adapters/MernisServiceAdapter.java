package javaCampHwD4P1.Adapters;

import java.rmi.RemoteException;

import javaCampHwD4P1.Entities.Customer;
import javaCampHwD4P1.Interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean check = false;

		try {
			check = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBrith().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return check;
	}

}
