package in.vamsoft.general.test;

import in.vamsoft.training.general.Math;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MathTest {
  private Math math = null;

  @BeforeClass
  public static void classMath() {
    System.out.println("MathTest.ClassMath()");
    Math math = new Math();
  }

  @AfterClass
  public static void classMathExit() {
    System.out.println("MathTest.ClassMathExit()");
    Math math = null;
  }

  @Before
  public void mathInit() {
    System.out.println("MathTest.MathInit()");
    math = new Math();
  }

  @After
  public void mathExit() {
    System.out.println("MathTest.MathExit()");
    Math math = null;
  }

  @Test
  public void testCase1() {
    System.out.println("MathTest.testCase1()");
    double result = math.sum(5.0, 3.0);
    double expected = 8.0;

    Assert.assertEquals(expected, result, 0);

  }

  @Test
  public void testIntCase1() {
    System.out.println("MathTest.testIntCase1()");
    int result = math.sum(5, 3);
    int expected = 8;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testIntCase2() {
    System.out.println("MathTest.testIntCase2()");
    int result = math.sum(0, 0);
    int expected = 0;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testIntCase3() {
    System.out.println("MathTest.testIntCase3()");
    int result = math.sum(-5, -3);
    int expected = -8;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testIntCase4() {
    System.out.println("MathTest.testIntCase4()");
    int result = math.sum(-5, 5);
    int expected = 0;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testCase2() {
    System.out.println("MathTest.testCase2()");
    double result = math.sum(0.0, 0.0);
    double expected = 0.0;

    Assert.assertEquals(expected, result, 0);

  }

  @Test
  public void testCase3() {
    System.out.println("MathTest.testCase3()");
    double result = math.sum(-5, -3);
    double expected = -8;

    Assert.assertEquals(expected, result, 0);

  }

  @Test
  public void testCase4() {
    System.out.println("MathTest.testCase4()");
    double result = math.sum(-5.0, 5.0);
    double expected = 0.0;

    Assert.assertEquals(expected, result, 0);

  }

}
