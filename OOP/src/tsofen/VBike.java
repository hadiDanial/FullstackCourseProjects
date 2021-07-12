package tsofen;

public class VBike extends Vehicle {

	public VBike(int year, int engineVolume, int fuelCapacity) 
	{
		super(2, year, engineVolume, "Bike", fuelCapacity);
	}
	
	public void driveOneWheel()
	{
		if(hasFuel())
		{
			System.out.println(getVehicleType() + " is driving on one wheel");		
			currentFuel -= 3;
		}
		else
		{
			outOfFuel();
		}
	}

}
