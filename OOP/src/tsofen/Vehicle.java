package tsofen;

public class Vehicle {
	private int numWheels;
	private int year;
	private int engineVolume;
	private int fuelCapacity;
	private String vehicleType = "Vehicle";
	
	protected int currentFuel;
	
	public Vehicle(int numWheels, int year, int engineVolume, String vehicleType, int fuelCapacity)
	{
		this.numWheels = numWheels;
		this.year = year;
		this.engineVolume = engineVolume;
		this.vehicleType = vehicleType;
		this.fuelCapacity = fuelCapacity;
		currentFuel = fuelCapacity;
	}
	
	protected String getVehicleType() 
	{
		return vehicleType;
	}

	protected void outOfFuel() {
		System.out.println(vehicleType + " is out of fuel");
	}
	
	protected boolean hasFuel() {
		return currentFuel > 0;
	}

	public void drive()
	{
		if(hasFuel())
		{
			System.out.println(vehicleType + " is moving");
			currentFuel-=2;
		}
		else
		{
			outOfFuel();
		}
	}


	public void stop()
	{
		System.out.println(vehicleType + " is stopping");
	}
	public void refuel()
	{
		System.out.println(vehicleType + " is refueling");
		currentFuel = fuelCapacity;
	}
	
	@Override
	public String toString() {
		return vehicleType + ", engine: " + engineVolume + ", " + year + " has " + numWheels + " wheels"
				+ "\nFuel Level: " + currentFuel + "/" + fuelCapacity;
	}
}
