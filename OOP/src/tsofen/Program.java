package tsofen;

public class Program {

	public static void main(String[] args) {
		Car car = new Car("BMW", "White", 2021);
		car.drive();
		System.out.println(car);
		car.stop();
		car.reverse();
		car.crash();
		System.out.println(car);
	}
}

