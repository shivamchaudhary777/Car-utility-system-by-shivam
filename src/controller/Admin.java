package controller;

//admin function calling is here 
import java.util.Scanner;

public class Admin

{
	// entry into main function
	public static void main(String [] args)
	
	{
		
		final int password = 123;
		int typePassword =0;
		boolean isNumber;
		boolean breaking = true;
		int choice;
		boolean check=true;
		AdminFunctionalities adminFunctionalities=new AdminFunctionalities();
		Scanner sc=new Scanner(System.in);
		System.out.println("HELLO ADMIN , PROVE YOU ARE A ADMIN ");
		System.out.println("SIR PLZZ ENTER PIN TO ACCESS THE SYSTEM ");
		System.out.println("HINT -(PIN IS 123)");
		
		// validate admin password is a integer
		do
		{
			if (sc.hasNextInt())
			{ typePassword= sc.nextInt();
			isNumber =true;
			}else {
				System.out.println(" SORRY SIR DIDNT UNDERSTAND U \n PLZZ ENTER PASSWORD IN INTEGER VALUE ONLY");
				isNumber =false;
				sc.next();
			}
		}while(!(isNumber));
		
		
		
		
		// check admin enter the right password, if yes he will access the system
		do 
		{
		
		if(password==typePassword) 
		{
		
		System.out.println("CONGRATULATIONS, NOW YOU HAVE ACCESS TO THE SYSTEM");
		
		
		
		
		
		// functions called by admin
		do {
			
		System.out.println("ENTER YOUR CHOICE:"
				+ "\nENTER 1- PLEASE ADD NEW CUSTOMER"
				+ "\nENTER 2- PLEASE ADD NEW CAR TO EXISTING CUSTOMER"
				+ "\nENTER 3- PLEASE LIST ALL CUSTOMERS WITH RECORD "
				+ "\nENTER 4- PLEASE LIST INDIVIDUAL CUSTOMERS BASED ON ID"
				+ "\nENTER 5- PLEASE GENERATES PRIZES FOR THE CUSTOMERS"
				+ "\nENTER 6- EXIT");
		choice=sc.nextInt();
		
			
		
		switch(choice) {
		case 1:
			adminFunctionalities.addNewCustomers();
			break;
		
		case 2:
			adminFunctionalities.addCarToExistingCustomers();
			break;
			
		case 3:
			adminFunctionalities.printAllExistingCustomers();
		
			break;
			
			
		case 4:
			adminFunctionalities.printExistingCustomerIds();
			break;
			
		case 5:
			adminFunctionalities.generateThePrizes();
			break;
		
		case 6:
			check=false;
			break;
		default:
			System.out.println("\n SIR DID'NT UNDERSTAND U, PLZZ ENTER THE FROM GIVEN OPTION ");
			break;
			
			
		
		}
		
	}
		while(check);
		breaking = false;
		break;

			}
				else {
					System.out.println(" SIR PLZZ TYPE RIGHT PASSWORD");
					typePassword= sc.nextInt();
				}
				
		}while(breaking);
}
 }

			
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		

