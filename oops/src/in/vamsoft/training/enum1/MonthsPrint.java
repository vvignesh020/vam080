package in.vamsoft.training.enum1;

import java.util.Scanner;

public class MonthsPrint {

  public MonthsPrint() {
    // TODO Auto-generated constructor stub
  }

  public void MonthPrint1() {
    // TODO Auto-generated method stub
    System.out.println("enter the month number :");
    Scanner month = new Scanner(System.in);
    int MONTH_NUMBER = month.nextInt();
    switch (MONTH_NUMBER) {
    case 1:
      System.out.println("january");
      break;
    case 2:
      System.out.println("february");
      break;
    case 3:
      System.out.println("march");
      break;
    case 4:
      System.out.println("April");
      break;
    case 5:
      System.out.println("may");
      break;
    case 6:
      System.out.println("june");
      break;
    case 7:
      System.out.println("july");
      break;
    case 8:
      System.out.println("august");
      break;
    case 9:
      System.out.println("september");
      break;
    case 10:
      System.out.println("october");
      break;
    case 11:
      System.out.println("november");
      break;
    case 12:
      System.out.println("december");
      break;

    default:
      System.out.println("invalid month number");
      break;
    }
  }
}
