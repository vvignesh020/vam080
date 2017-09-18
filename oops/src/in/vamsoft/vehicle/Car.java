package in.vamsoft.vehicle;

public abstract class Car extends Vehicle {
	public Car() {
		System.out.println("Car.Car()");
	}

	public void start() {
		System.out.println("Car.start()");
	}

	public void stop() {
		System.out.println("Car.stop()");
	}

	public void handBrake() {
		System.out.println("Car.handBrake()");

	}
}
