package dayFour.Abstract;

import dayFour.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veri taban�na kaydedildi: "+ customer.getFirstName()+" "+ customer.getLastName().toUpperCase());
		
	}

}
