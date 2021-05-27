package dayFour.Abstract;

import dayFour.Entities.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
