
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)1L);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)'#');
    buyDataLayer0.processPayment((double)'a');

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)'#');
    buyDataLayer0.processPayment((double)(short)0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)10);
    buyDataLayer0.processPayment((double)0);
    buyDataLayer0.processPayment((double)100L);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)(short)10);
    buyDataLayer0.processPayment((double)10L);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment((-1.0d));
    buyDataLayer0.processPayment((double)0L);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)10);
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)1L);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment((-1.0d));
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)(-1L));
    buyDataLayer0.processPayment((double)(byte)0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((-1.0d));
    buyDataLayer0.processPayment((double)0.0f);
    buyDataLayer0.processPayment((double)10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)10);
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)(short)10);
    buyDataLayer0.processPayment((double)1L);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)0L);
    buyDataLayer0.processPayment(1.0d);
    buyDataLayer0.processPayment((double)(short)100);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((-1.0d));
    buyDataLayer0.processPayment((double)(byte)100);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment(0.0d);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)10);
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)(short)10);
    buyDataLayer0.processPayment(0.0d);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)(short)0);
    buyDataLayer0.processPayment((double)(short)1);
    buyDataLayer0.processPayment((double)'a');

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment(100.0d);
    buyDataLayer0.processPayment((double)(short)0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment((double)1);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment((double)100.0f);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)10);
    buyDataLayer0.processPayment((double)0);
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)100L);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)10);
    buyDataLayer0.processPayment((double)(short)-1);
    buyDataLayer0.processPayment((double)0L);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)0);
    buyDataLayer0.processPayment((double)(-1));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)(short)10);
    buyDataLayer0.processPayment((double)(-1.0f));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment(100.0d);
    buyDataLayer0.processPayment((double)'#');
    buyDataLayer0.processPayment((double)'#');
    buyDataLayer0.processPayment(1.0d);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)'#');
    buyDataLayer0.processPayment((double)(byte)100);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)10);
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)(short)10);
    buyDataLayer0.processPayment((double)(short)0);
    buyDataLayer0.processPayment((-1.0d));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)0.0f);
    buyDataLayer0.processPayment((double)1.0f);
    buyDataLayer0.processPayment((double)(short)10);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)(short)0);
    buyDataLayer0.processPayment((double)(-1L));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)0L);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)1L);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)1);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)'#');
    buyDataLayer0.processPayment((double)10.0f);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(short)0);
    buyDataLayer0.processPayment((double)10L);
    buyDataLayer0.processPayment((double)(byte)100);
    buyDataLayer0.processPayment((double)' ');

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)'#');
    buyDataLayer0.processPayment((double)'4');

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment(10.0d);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)10);
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)(short)10);
    buyDataLayer0.processPayment((double)(short)0);
    buyDataLayer0.processPayment((double)(short)-1);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment((double)(short)0);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment((-1.0d));
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)10.0f);
    buyDataLayer0.processPayment((double)(byte)0);
    buyDataLayer0.processPayment(10.0d);
    buyDataLayer0.processPayment((double)(short)1);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)(short)10);
    buyDataLayer0.processPayment((double)(byte)100);
    buyDataLayer0.processPayment((double)(byte)100);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)(byte)0);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)0L);
    buyDataLayer0.processPayment(1.0d);
    buyDataLayer0.processPayment((double)10L);
    buyDataLayer0.processPayment((double)0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment(100.0d);
    buyDataLayer0.processPayment((double)'#');
    buyDataLayer0.processPayment((double)(byte)1);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(short)0);
    buyDataLayer0.processPayment((double)10L);
    buyDataLayer0.processPayment((double)(byte)0);
    buyDataLayer0.processPayment(0.0d);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)10);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)0);
    buyDataLayer0.processPayment((double)100L);
    buyDataLayer0.processPayment((double)(short)10);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(byte)1);
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)(short)10);
    buyDataLayer0.processPayment((double)100L);
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)(-1));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment((-1.0d));
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)10.0f);
    buyDataLayer0.processPayment((double)(byte)0);
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)10L);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment(0.0d);
    buyDataLayer0.processPayment((double)10.0f);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment((-1.0d));
    buyDataLayer0.processPayment((double)100.0f);
    buyDataLayer0.processPayment((double)10.0f);
    buyDataLayer0.processPayment((double)(byte)0);
    buyDataLayer0.processPayment((double)(short)1);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    BuyDataLayer buyDataLayer0 = new BuyDataLayer();
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment((double)' ');
    buyDataLayer0.processPayment((-1.0d));
    buyDataLayer0.processPayment((double)(-1.0f));
    buyDataLayer0.processPayment(0.0d);

  }

}
