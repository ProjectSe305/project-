
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "hi!");
    boolean b15 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("", "");
    boolean b21 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b15 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "hi!");
    boolean b15 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b18 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b21 = loginBusinessLayer0.login("hi!", "");
    boolean b24 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("hi!", "");
    boolean b6 = loginBusinessLayer0.login("hi!", "");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("", "");
    boolean b21 = loginBusinessLayer0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("", "hi!");
    boolean b21 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b15 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("hi!", "");
    boolean b6 = loginBusinessLayer0.login("hi!", "");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b18 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("hi!", "");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b15 = loginBusinessLayer0.login("", "hi!");
    boolean b18 = loginBusinessLayer0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "");
    boolean b18 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("", "hi!");
    boolean b21 = loginBusinessLayer0.login("", "");
    boolean b24 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b18 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("", "");
    boolean b15 = loginBusinessLayer0.login("", "hi!");
    boolean b18 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "");
    boolean b18 = loginBusinessLayer0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "");
    boolean b15 = loginBusinessLayer0.login("", "hi!");
    boolean b18 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("hi!", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "hi!");
    boolean b6 = loginBusinessLayer0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("hi!", "");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b18 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("hi!", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("hi!", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("", "");
    boolean b21 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "");
    boolean b9 = loginBusinessLayer0.login("", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "hi!");
    boolean b6 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("", "hi!");
    boolean b12 = loginBusinessLayer0.login("", "hi!");
    boolean b15 = loginBusinessLayer0.login("", "");
    boolean b18 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b15 = loginBusinessLayer0.login("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("hi!", "");
    boolean b9 = loginBusinessLayer0.login("hi!", "");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b18 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("", "hi!");
    boolean b18 = loginBusinessLayer0.login("hi!", "");
    boolean b21 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b24 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b27 = loginBusinessLayer0.login("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("", "hi!");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "");
    boolean b15 = loginBusinessLayer0.login("", "hi!");
    boolean b18 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b21 = loginBusinessLayer0.login("hi!", "");
    boolean b24 = loginBusinessLayer0.login("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    LoginBusinessLayer loginBusinessLayer0 = new LoginBusinessLayer();
    boolean b3 = loginBusinessLayer0.login("", "");
    boolean b6 = loginBusinessLayer0.login("hi!", "");
    boolean b9 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b12 = loginBusinessLayer0.login("hi!", "hi!");
    boolean b15 = loginBusinessLayer0.login("", "hi!");
    boolean b18 = loginBusinessLayer0.login("", "");
    boolean b21 = loginBusinessLayer0.login("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

}
