import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;
// import behaviours.*;

public class PandaTest {

  Panda panda;

  @Before
  public void befor() {
    panda = new Panda("Polly", SexType.FEMALE, 1000.00);
  }

  @Test
  public void hasName() {
    String name = panda.getName();
    assertEquals( "Polly", name );
  }

  @Test
  public void hasSex() {
    SexType sex = panda.getSex();
    assertEquals( SexType.FEMALE, sex );
  }

  @Test
  public void hasValue() {
    double value = panda.getValue();
    assertEquals( 1000.00, value, 0.001 );
  }

  @Test
  public void bellyStartsEmpty() {
    assertEquals( 0, panda.foodCount() );
  }

}