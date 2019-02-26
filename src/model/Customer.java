package model;

//customer class which handle which handle the cars

import java.util.Scanner;
import java.util.ArrayList;


public class Customer 

{
	private int customerId;
	private String customerName;
	
	
	// array list containing cars 
	private ArrayList<Cars> cars=new ArrayList<>();
	
	
	// parameterised constructor
	public Customer(int customerId, String customerName)
	
	{
		
		this.customerId=customerId;
		this.customerName=customerName;
	}
	
	
	
  public int getId() 
  
  {
		
		return customerId;
	}
  
  
  
  
	public String getName()
	
	{
		return customerName;
	}
	
	
	
	
	
	
	// funtion for choosing the car
	public void addCar()  {
		int choice;
		int carId;
		String modelNo;
		double price;
		Scanner sc=new Scanner(System.in);
		System.out.println("SIR PLZZ TELL ME WHICH CAR YOU WANT"
				+ "\n1-HYUNDAI"
				+ "\n2-TOYOTA"
				+ "\n3-MARUTI");
		
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println(" SIR PLZZ ENTER THE HYUNDAI CAR ID ");
			carId=sc.nextInt();
			System.out.println( "SIR PLZZ ENTER THE HYUNDAI CAR MODEL NO");
			modelNo=sc.next();
			System.out.println("SIR PLZZ ENTER THE HYUNDAI CAR PRICE");
			price=sc.nextDouble();
			HyundaiCar hyundaiCar=new HyundaiCar(carId,modelNo,price);
			cars.add(hyundaiCar);
			break;
			
		case 2:
			System.out.println(" SIR PLZZ ENTER THE HYUNDAI CAR ID ");
			carId=sc.nextInt();
			System.out.println( "SIR PLZZ ENTER THE HYUNDAI CAR MODEL NO");
			modelNo=sc.next();
			System.out.println("SIR PLZZ ENTER THE HYUNDAI CAR PRICE");
			price=sc.nextDouble();
			ToyotaCar toyotaCar=new ToyotaCar(carId,modelNo,price);
			cars.add(toyotaCar);
			break;
		case 3:
			
			System.out.println("SIR PLZZ ENTER THE HYUNDAI CAR ID ");
			carId=sc.nextInt();
			System.out.println( "SIR PLZZ ENTER THE HYUNDAI CAR MODEL NO");
			modelNo=sc.next();
			System.out.println("SIR PLZZ ENTER THE HYUNDAI CAR PRICE");
			price=sc.nextDouble();
			MarutiCar marutiCar=new MarutiCar(carId,modelNo,price);
			cars.add(marutiCar);
			break;
			
		default: 
			System.out.println("SIR PLZZ ENTER THE VALID OPTION");
			
		}
		
	}
	
	
	
	// function for printing car information
	public void printAllInformation() {
		for(Cars carInfo:cars) {
			carInfo.printCarInformation();
		}
	}

	
}
	

	


