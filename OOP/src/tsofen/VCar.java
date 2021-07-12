package tsofen;

public class VCar extends Vehicle {
	private int numDoors;
	public VCar(int year, int numDoors, int engineVolume, int fuelCapacity) 
	{
		super(4, year, engineVolume, "Car", fuelCapacity);
		this.numDoors = numDoors;
	}

	public void reverse()
	{
		if(hasFuel())
		{
			System.out.println(getVehicleType() + " is reversing");
			currentFuel--;
		}
		else
		{
			outOfFuel();
		}
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nThe car has " + numDoors + " doors.";
	}
}
