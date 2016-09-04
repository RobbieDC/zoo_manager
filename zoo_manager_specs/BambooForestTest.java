import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class BambooForestTest {

  BambooForest bambooForest;
  Panda panda;

  @Before
  public void before() {
    bambooForest = new BambooForest( 5 );
    panda = new Panda( "Peggy", SexType.FEMALE, 900.00 );
  }

  @Test
  public void hasCapacity() {
    int capacity = bambooForest.getCapacity();
    assertEquals( 5, capacity );
  }

  @Test
  public void startsEmpty() {
    int occupancy = bambooForest.getNumOccupants();
    assertEquals( 0, occupancy );
  }

  @Test
  public void canAddPanda() {
    bambooForest.addAnimal( panda );
    assertEquals( 1, bambooForest.getNumOccupants() );
  }

}