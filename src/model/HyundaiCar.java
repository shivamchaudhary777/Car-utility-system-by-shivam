package model;


//this class is inherited from cars class
public class HyundaiCar extends Cars

{
	// parameterised constructor
	HyundaiCar(int carId, String modelNo, Double price)
	
	{
		super(carId, modelNo, price);
		this.carId=carId;
		this.modelNo=modelNo;
		this.price=price;
	}
	
	
	
	// abstract method definition
	@Override
	public double getResaleValue()
	
	{
		resaleValue=0.8*price;
		return resaleValue;
	}
	
	

	// abstract method definition
	@Override
	public void printCarInformation()
	
	{
		System.out.println("CAR NAME HYUNDAI"
				+ "\n CAR ID="+getCarId()+""
	            + "\n CAR MODEL NUMBER="+getModelNo()+""
			    + "\n CAR PRICE="+getPrice()+""
				+ "\n CAR RESALE VALUE="+getResaleValue()); 
	}
	
	
		
	}
	
