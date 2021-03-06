import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;
import behaviours.*;

public class PolarBearTest {

  PolarBear polarBear;
  Edible burrito;

  @Before
  public void before() {
    polarBear = new PolarBear( "Peter", SexType.MALE, 2000.00 );
    burrito = new Burrito();
  }

  @Test
  public void hasName() {
    assertEquals( "Peter", polarBear.getName() );
  }

  @Test
  public void hasSex() {
    assertEquals( SexType.MALE, polarBear.getSex() );
  }

  @Test
  public void hasValue() {
    assertEquals( 2000.00, polarBear.getValue(), 0.001 );
  }

  @Test
  public void bellyStartsEmpty() {
    assertEquals( 0, polarBear.foodCount() );
  }

  @Test
  public void canEatBurrito() {
    polarBear.eat(burrito);
    assertEquals( 1, polarBear.foodCount() );
  }

}