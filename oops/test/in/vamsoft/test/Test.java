/**
 *
 */
package in.vamsoft.test;

import in.vamsoft.vehicle.Car;
import in.vamsoft.vehicle.SportsCar;

/**
 * @author vamsoft
 *
 */
public class Test {

  /**
   * @param args
   */

  public static void main(String[] args) {

    SportsCar car = new SportsCar("SUV");
    System.out.println(car);
    Car c1 = new SportsCar();
    System.out.println(c1);

  }

}
