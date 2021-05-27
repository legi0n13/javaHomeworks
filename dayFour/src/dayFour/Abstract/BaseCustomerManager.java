package dayFour.Abstract;

import dayFour.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanưna kaydedildi: "+ customer.getFirstName()+" "+ customer.getLastName().toUpperCase());
		
	}

}
