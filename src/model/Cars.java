package model;


abstract public class Cars

{    
	// declaration of car attributes
	protected int carId;
	protected String modelNo;
	protected Double price;
	protected Double resaleValue;
	
	
	// abstract methods 
	abstract public double getResaleValue();    
	abstract public void printCarInformation();
	
	
	// parameterised constructor
	Cars(int carId,String modelNo,Double price)
	
	{
		this.carId=carId;
		this.modelNo=modelNo;
		this.price=price;
	}
	
	// getter methods 
	public int getCarId() 
	
	{
		return carId;
	}
	
	
	
	
	public String getModelNo() 
	
	{
		return modelNo;
	}
	
	
	
	
	public Double getPrice()
	
	{
		return price;
	}
	
	
	
	
	
	
}
