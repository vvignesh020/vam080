package in.vamsoft.vehicle;

public abstract class Vehicle {

	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
		
	}
public abstract void start();
public abstract void brake();
public abstract void stop();

}
