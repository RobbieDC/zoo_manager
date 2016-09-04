import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class BambooForestTest {

  BambooForest bambooForest;
  Panda panda_peggy;
  Panda panda_john;

  @Before
  public void before() {
    bambooForest = new BambooForest( 5 );
    panda_peggy = new Panda( "Peggy", SexType.FEMALE, 900.00 );
    panda_john = new Panda( "John", SexType.MALE, 1500.00 );
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
    bambooForest.addAnimal( panda_peggy );
    assertEquals( 1, bambooForest.getNumOccupants() );
  }

  @Test
  public void canRemovePanda() {
    bambooForest.addAnimal( panda_peggy );
    bambooForest.addAnimal( panda_john );
    Animal removedPanda = bambooForest.removeAnimal( panda_john );
    assertEquals( "John", removedPanda.getName() );
  }

}