package tsofen;

public class VehicleMain {

	public static void main(String[] args) 
	{
		VCar car = new VCar(2021, 2, 3000, 20);
		VBike bike = new VBike(2022, 5000, 10);
		
		car.drive();
		car.reverse();
		car.drive();
		System.out.println(car);
		car.drive();
		car.drive();
		car.refuel();
		System.out.println(car);

		System.out.println("--------------------");
		
		bike.drive();
		System.out.println(bike);
		bike.driveOneWheel();
		System.out.println(bike);
		bike.drive();
		System.out.println(bike);
		bike.drive();
		bike.drive();
		bike.refuel();
		System.out.println(bike);
	}

}
