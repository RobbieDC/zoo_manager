import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;
import behaviours.*;

public class BambooForestTest {

  BambooForest bambooForest;
  Panda pandaPeggy;
  Panda pandaJohn;

  @Before
  public void before() {
    bambooForest = new BambooForest( 5 );
    pandaPeggy = new Panda( "Peggy", SexType.FEMALE, 900.00 );
    pandaJohn = new Panda( "John", SexType.MALE, 1500.00 );
  } 

  @Test
  public void hasCapacity() {
    int capacity = bambooForest.getCapacity();
    assertEquals( 5, capacity );
  }

  @Test
  public void hasEmptyFoodArray() {
    assertEquals( 0, bambooForest.getFood().size() );
  }



  @Test
  public void startsEmpty() {
    int occupancy = bambooForest.getNumOccupants();
    assertEquals( 0, occupancy );
  }
 
  @Test
  public void canAddPanda() {
    bambooForest.addAnimal( pandaPeggy );
    assertEquals( 1, bambooForest.getNumOccupants() );
  }

  @Test
  public void canRemovePanda() {
    bambooForest.addAnimal( pandaPeggy );
    bambooForest.addAnimal( pandaJohn );
    BambooForestable removedBambooForestable = bambooForest.removeAnimal( pandaJohn );
    Panda original = (Panda) removedBambooForestable;
    assertEquals( "John", original.getName() );
  }

}