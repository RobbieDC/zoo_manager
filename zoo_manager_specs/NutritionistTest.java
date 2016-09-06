import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class NutritionistTest {

  Zoo zoo;
  Nutritionist nutritionist;
  ZooKeeper zooKeeper;
  BambooForest bambooForest;
  Edible food;

  @Before
  public void before() {
    zoo = new Zoo();
    nutritionist = new Nutritionist("Charley", zoo);
    zooKeeper = new ZooKeeper( "Kat", zoo );
    bambooForest = new BambooForest( 7 );
    zooKeeper.addEnclosure(bambooForest);
    food = new Burrito();
  }

  @Test
  public void hasName() {
    assertEquals( "Charley", nutritionist.getName() );
  }

  @Test
  public void zooHasEnclosure() {
    assertEquals( 1, zooKeeper.getNumEnclosures() );
  }

  @Test
  public void canAddFoodToBambooForest() {
    nutritionist.addFoodToEnclosure( burrito );
    int amountOfFood = zooKeeper.getEnclosure( bambooForest ).getFood().size();
    assertEquals( 1,  amountOfFood );
  }

}