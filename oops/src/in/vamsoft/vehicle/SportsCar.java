package in.vamsoft.vehicle;


public class SportsCar extends Car {

  public SportsCar() {
    System.out.println("SportsCar.SportsCar()");
  }

  public SportsCar(String model) {
    System.out.println("SportsCar.SprotsCar()");
    System.out.println(model);
  }

  @Override
  public void brake() {
    System.out.println("SportsCar.brake()");

  }

  public void handbrake() {
    System.out.println("SportsCar.handBrake()");

  }

  public void fourWeelDrive() {
    System.out.println("SportsCar.fourWeelDrive()");
  }

}
