package tsofen;

public class Car {
	private String firm;
	private String color;
	private int year;
	private float kilometrage;
	private boolean isCrashed = false;

	public Car(String firm, String color, int year) {
		this.firm = firm;
		this.color = color;
		this.year = year;
		kilometrage = 0;
	}

	public Car(String firm, String color, int year, float kilometrage) {
		this.firm = firm;
		this.color = color;
		this.year = year;
		this.kilometrage = kilometrage;
	}

	public void drive() {

		System.out.println(color + " " + firm + " is driving.");
		kilometrage += 10;

	}

	public void stop() {
		System.out.println(color + " " + firm + " is stopping.");

	}

	public void reverse() {
		System.out.println(color + " " + firm + " is reversing.");
		kilometrage += 0.5f;
	}

	public void crash() {
		System.out.println(color + " " + firm + " has crashed!");
		isCrashed = true;
	}

	public String toString() {
		return color + " " + firm + ", " + year + " (" + kilometrage + ")." + isCrashed;
	}
}
