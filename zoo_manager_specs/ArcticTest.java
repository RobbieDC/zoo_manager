import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;
import behaviours.*;

public class ArcticTest {

  Arctic arctic;
  PolarBear polarPablo;
  PolarBear polarPabla;

  @Before
  public void before() {
    arctic = new Arctic( 5 );
    polarPablo = new PolarBear("Pablo", SexType.MALE, 1800.00);
    polarPabla = new PolarBear("Pabla", SexType.FEMALE, 2100.00);
  }

  @Test
  public void hasCapacity() {
    assertEquals( 5, arctic.getCapacity() );
  }

  @Test
  public void hasEmptyFoodArray() {
    assertEquals( 0, arctic.getFoodStore().size() );
  }

  @Test
  public void startsEmpty() {
    int occupancy = arctic.getNumOccupants();
    assertEquals( 0, occupancy );
  }
  
  @Test
  public void canAddPolarBear() {
    arctic.addAnimal( polarPabla );
    assertEquals( 1, arctic.getNumOccupants() );
  }

  @Test
  public void canRemovePolarBear() {
    arctic.addAnimal( polarPablo );
    arctic.addAnimal( polarPabla );
    Arcticable removedArcticable = arctic.removeAnimal( polarPabla );
    PolarBear original = (PolarBear) removedArcticable;
    assertEquals( "Pabla", original.getName() );
  }

}