package dayFour.Concrete;

import dayFour.Abstract.ICustomerCheckService;
import dayFour.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
		
	}

}
