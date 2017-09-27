package in.vamsoft.kathysierra.unit4;

public class StringConcatination {

  public static void main(String[] args) {
    String a = "String";
    int b = 3;
    int c = 7;
    System.out.println(a + b + c);
    System.out.println(a + (b + c));
    String s = "123";
    s += 45;
    s += 67;
    System.out.println(s);
    int numOfPets = 3;
    String status = (numOfPets<2) ? "Pet limit not exceeded" : "too many pets";
    System.out.println("This pet status is " + status);
    byte b1 = 6 & 8;
    byte b2 = 7 | 9;
    byte b3 = 5 ^ 4;
    System.out.println(b1 + " " + b2 + " " + b3);
  }

}
