import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

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
  public void startsEmpty() {
    int occupancy = arctic.getNumOccupants();
    assertEquals( 0, occupancy );
  }
  
  @Test
  public void canAddPanda() {
    arctic.addAnimal( polarPabla );
    assertEquals( 1, arctic.getNumOccupants() );
  }

  @Test
  public void canRemovePanda() {
    arctic.addAnimal( polarPablo );
    arctic.addAnimal( polarPabla );
    Animal removedAnimal = arctic.removeAnimal( polarPabla );
    assertEquals( "Pabla", removedAnimal.getName() );
  }

}