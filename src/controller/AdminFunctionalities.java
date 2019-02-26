package controller;

//definition of all function which function admin perform
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import model.Customer;
import util.Sorting;

	public class AdminFunctionalities
	
	{
		// array list containing customers
		ArrayList<Customer> customerArray=new ArrayList<>();
		
		
		
		
		// function for adding new customer
	    public void addNewCustomers()
	    {
			String customerName;
			int customerId = 0;
			boolean isNumber;
		
			Scanner sc=new Scanner(System.in);
			System.out.println("SIR PLEASE ENTER THE CUSTOMER ID ");
			
			// validate customer ID is int value only
			do {
				if (sc.hasNextInt())
				{ customerId = sc.nextInt();
				isNumber =true;
				}else {
					System.out.println(" SORRY SIR, I DID'NT UNDERSTAND U \nPLZZ  ENTER THE ID IN INTEGER VALUE ONLY");
					isNumber =false;
					sc.next();
				}
			}while(!(isNumber));
			System.out.println(customerId);
			
			
			
			// check no two customer have same ID
			for(Customer cu:customerArray) 
			{
				if(cu.getId()==customerId)
				{
					System.out.println("NO TWO CUSTOMERS CAN HAVE SAME ID");
					return;
				}
			}	
				
			System.out.println("SIR PLZZ ENTER THE NAME ");
			
			customerName=sc.next();
			Customer customer=new Customer(customerId,customerName);
			customerArray.add(customer);
			
		}
			
		
			
			
			
		// if ID exist then add car to following customer
		
		public void addCarToExistingCustomers() {
			int customerAddId;
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE EXISTING ID OF CUSTOMER");
			customerAddId=sc.nextInt();
			for(Customer cu:customerArray) {
				if(cu.getId()==customerAddId)
				 cu.addCar();
				else {System.out.println("CUSTOMER ID NOT EXIST");
				
				 
				
				}
			}
			
			
		}
		
		
		
		
		
		
		// type customer ID ,if exist then print customer details
		public void printExistingCustomerIds() 
		{
			 int findId;
			System.out.println("PRINT EXISTING CUSTOMER ID");
			Scanner sc=new Scanner(System.in);
			findId=sc.nextInt();
			
			for(Customer printCustomer:customerArray )
			{
				if(printCustomer.getId()==findId)
				{
					
					System.out.println(printCustomer.getId()+" "+printCustomer.getName());
				}
				
				
			}
		}
		
		
		
		// print all customers as well as car details
		public void printAllExistingCustomers()
		{
			Collections.sort(customerArray, new Sorting());
			for(Customer cu:customerArray)
			{
				
				System.out.println("CUSTOMER ID IS="+cu.getId()+""
						       + "CUSTOMER NAME IS="+cu.getName());
				
				cu.printAllInformation();
				
			}
			
			}
		
		
		
		
		// generate prizes for ID
		public void generateThePrizes() 
		{
			ArrayList<Integer> getsId=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println(" SIR PLZZ ENTER 3 RANDOM ID");
			for(int i=0;i<3;i++)
			{
				getsId.add(sc.nextInt());
				
			}
			
			if(customerArray.size()==0) 
			{
				System.out.println("\n THERE IS NO CUSTOMER TILL NOW");
				return;
				}
			
				else 
				{
					    Random generate=new Random();
						for(int i=0;i<6;i++)
						{
							int compare=generate.nextInt(customerArray.size());
							
						
						if(getsId.contains(customerArray.get(compare).getId())&& getsId.size()!=0) {
							System.out.println(customerArray.get(compare).getId()+"  ID HAVE  WON THE PRIZE");
							getsId.remove(new Integer(customerArray.get(compare).getId()));
							
						}
						else
						{
							return;
						}
						
						}
					
					 
				}
						
			
			
			
		}
	
	
}
