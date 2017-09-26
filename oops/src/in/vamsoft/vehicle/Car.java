package in.vamsoft.vehicle;

public abstract class Car extends Vehicle {
  public Car() {
    System.out.println("Car.Car()");
  }

  @Override
  public void start() {
    System.out.println("Car.start()");
  }

  @Override
  public void stop() {
    System.out.println("Car.stop()");
  }

  public void handBrake() {
    System.out.println("Car.handBrake()");

  }
}
