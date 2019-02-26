package util;

//the comparator interface used to sort the customer names
import java.util.Comparator;

import model.Customer;

public class Sorting implements Comparator<Customer> {

	@Override
	public int compare(Customer customerName1, Customer customerName2) {
		
		return customerName1.getName().compareTo(customerName2.getName());
	}
	
	}
