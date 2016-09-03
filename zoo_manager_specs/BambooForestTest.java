import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class BambooForestTest {

  BambooForest bambooForest;

  @Before
  public void before() {
    bambooForest = new BambooForest( 5 );
  }

  @Test
  public void hasCapacity() {
    int capacity = bambooForest.getCapacity();
    assertEquals( 5, capacity );
  }

  @Test
  public void startsEmpty() {
    int occupancy = bambooForest.getOccupants().size();
    assertEquals( 0, occupancy );
  }

}