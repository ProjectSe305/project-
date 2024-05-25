
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)1L);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)'#');
    buyBusinessLayer0.processPayment((double)'a');

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)'#');
    buyBusinessLayer0.processPayment((double)(short)0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)10);
    buyBusinessLayer0.processPayment((double)0);
    buyBusinessLayer0.processPayment((double)100L);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)(short)10);
    buyBusinessLayer0.processPayment((double)10L);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment((-1.0d));
    buyBusinessLayer0.processPayment((double)0L);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)10);
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)1L);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment((-1.0d));
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)(-1L));
    buyBusinessLayer0.processPayment((double)(byte)0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((-1.0d));
    buyBusinessLayer0.processPayment((double)0.0f);
    buyBusinessLayer0.processPayment((double)10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)10);
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)(short)10);
    buyBusinessLayer0.processPayment((double)1L);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)0L);
    buyBusinessLayer0.processPayment(1.0d);
    buyBusinessLayer0.processPayment((double)(short)100);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((-1.0d));
    buyBusinessLayer0.processPayment((double)(byte)100);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment(0.0d);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)10);
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)(short)10);
    buyBusinessLayer0.processPayment(0.0d);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)(short)0);
    buyBusinessLayer0.processPayment((double)(short)1);
    buyBusinessLayer0.processPayment((double)'a');

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment(100.0d);
    buyBusinessLayer0.processPayment((double)(short)0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment((double)1);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment((double)100.0f);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)10);
    buyBusinessLayer0.processPayment((double)0);
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)100L);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)10);
    buyBusinessLayer0.processPayment((double)(short)-1);
    buyBusinessLayer0.processPayment((double)0L);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)0);
    buyBusinessLayer0.processPayment((double)(-1));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)(short)10);
    buyBusinessLayer0.processPayment((double)(-1.0f));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment(100.0d);
    buyBusinessLayer0.processPayment((double)'#');
    buyBusinessLayer0.processPayment((double)'#');
    buyBusinessLayer0.processPayment(1.0d);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)'#');
    buyBusinessLayer0.processPayment((double)(byte)100);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)10);
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)(short)10);
    buyBusinessLayer0.processPayment((double)(short)0);
    buyBusinessLayer0.processPayment((-1.0d));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)0.0f);
    buyBusinessLayer0.processPayment((double)1.0f);
    buyBusinessLayer0.processPayment((double)(short)10);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)(short)0);
    buyBusinessLayer0.processPayment((double)(-1L));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)0L);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)1L);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)1);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)'#');
    buyBusinessLayer0.processPayment((double)10.0f);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(short)0);
    buyBusinessLayer0.processPayment((double)10L);
    buyBusinessLayer0.processPayment((double)(byte)100);
    buyBusinessLayer0.processPayment((double)' ');

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)'#');
    buyBusinessLayer0.processPayment((double)'4');

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment(10.0d);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)10);
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)(short)10);
    buyBusinessLayer0.processPayment((double)(short)0);
    buyBusinessLayer0.processPayment((double)(short)-1);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment((double)(short)0);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment((-1.0d));
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)10.0f);
    buyBusinessLayer0.processPayment((double)(byte)0);
    buyBusinessLayer0.processPayment(10.0d);
    buyBusinessLayer0.processPayment((double)(short)1);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)(short)10);
    buyBusinessLayer0.processPayment((double)(byte)100);
    buyBusinessLayer0.processPayment((double)(byte)100);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)(byte)0);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)0L);
    buyBusinessLayer0.processPayment(1.0d);
    buyBusinessLayer0.processPayment((double)10L);
    buyBusinessLayer0.processPayment((double)0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment(100.0d);
    buyBusinessLayer0.processPayment((double)'#');
    buyBusinessLayer0.processPayment((double)(byte)1);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(short)0);
    buyBusinessLayer0.processPayment((double)10L);
    buyBusinessLayer0.processPayment((double)(byte)0);
    buyBusinessLayer0.processPayment(0.0d);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)10);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)0);
    buyBusinessLayer0.processPayment((double)100L);
    buyBusinessLayer0.processPayment((double)(short)10);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(byte)1);
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)(short)10);
    buyBusinessLayer0.processPayment((double)100L);
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)(-1));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment((-1.0d));
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)10.0f);
    buyBusinessLayer0.processPayment((double)(byte)0);
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)10L);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment(0.0d);
    buyBusinessLayer0.processPayment((double)10.0f);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment((-1.0d));
    buyBusinessLayer0.processPayment((double)100.0f);
    buyBusinessLayer0.processPayment((double)10.0f);
    buyBusinessLayer0.processPayment((double)(byte)0);
    buyBusinessLayer0.processPayment((double)(short)1);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    BuyBusinessLayer buyBusinessLayer0 = new BuyBusinessLayer();
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment((double)' ');
    buyBusinessLayer0.processPayment((-1.0d));
    buyBusinessLayer0.processPayment((double)(-1.0f));
    buyBusinessLayer0.processPayment(0.0d);

  }

}
