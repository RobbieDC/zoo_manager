import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class NutritionistTest {

  Zoo zoo;
  Nutritionist nutritionist;
  ZooKeeper zooKeeper;
  BambooForest bambooForest;

  @Before
  public void before() {
    zoo = new Zoo();
    nutritionist = new Nutritionist("Charley", zoo);
    zooKeeper = new ZooKeeper( "Kat", zoo );
    bambooForest = new BambooForest( 7 );
    zooKeeper.addEnclosure(bambooForest);
  }

  @Test
  public void hasName() {
    assertEquals( "Charley", nutritionist.getName() );
  }

  @Test
  public void zooHasEnclosure() {
    assertEquals( 1, zooKeeper.getNumEnclosures() );
  }

  // @Test
  // public void canAddFoodToBambooForest() {
  //   assertEquals(  )
  // }

}