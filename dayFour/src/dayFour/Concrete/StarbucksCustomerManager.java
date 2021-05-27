package dayFour.Concrete;

import dayFour.Abstract.BaseCustomerManager;
import dayFour.Abstract.ICustomerCheckService;
import dayFour.Abstract.ICustomerService;
import dayFour.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckService customerService) {
		this.customerCheckService = customerService;
	}

	@Override
	public void save(Customer customer)
	{
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Geçerli bir birey deðil");
		}
		
	}

}
