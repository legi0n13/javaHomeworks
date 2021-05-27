package dayFour;

import dayFour.Abstract.BaseCustomerManager;
import dayFour.Adapter.MernisServiceAdapter;
import dayFour.Concrete.NeroCustomerManager;
import dayFour.Concrete.StarbucksCustomerManager;
import dayFour.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Legion","13",2001,23466675983L));
		
	}

}
