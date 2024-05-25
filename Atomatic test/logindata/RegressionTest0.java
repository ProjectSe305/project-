
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    boolean b21 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b15 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b21 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b24 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    boolean b21 = loginDataLayer0.validateCredentials("hi!", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b21 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b15 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b21 = loginDataLayer0.validateCredentials("", "");
    boolean b24 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    boolean b21 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "");
    boolean b9 = loginDataLayer0.validateCredentials("", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b6 = loginDataLayer0.validateCredentials("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b15 = loginDataLayer0.validateCredentials("", "");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b21 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b24 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b27 = loginDataLayer0.validateCredentials("", "hi!");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b15 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b21 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b24 = loginDataLayer0.validateCredentials("", "");
    
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

    LoginDataLayer loginDataLayer0 = new LoginDataLayer();
    boolean b3 = loginDataLayer0.validateCredentials("", "");
    boolean b6 = loginDataLayer0.validateCredentials("hi!", "");
    boolean b9 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b12 = loginDataLayer0.validateCredentials("hi!", "hi!");
    boolean b15 = loginDataLayer0.validateCredentials("", "hi!");
    boolean b18 = loginDataLayer0.validateCredentials("", "");
    boolean b21 = loginDataLayer0.validateCredentials("hi!", "");
    
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
