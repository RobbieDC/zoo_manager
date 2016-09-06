import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;
import behaviours.*;

public class NutritionistTest {

  Zoo zoo;
  Nutritionist nutritionist;
  ZooKeeper zooKeeper;
  Enclosure bambooForest;
  Enclosure arctic;
  Burrito burrito;

  @Before
  public void before() {
    zoo = new Zoo();
    nutritionist = new Nutritionist("Charley", zoo);
    zooKeeper = new ZooKeeper( "Kat", zoo );
    bambooForest = new BambooForest( 7 );
    arctic = new Arctic( 5 );
    zooKeeper.addEnclosure(bambooForest);
    zooKeeper.addEnclosure(arctic);
    burrito = new Burrito();
  }

  @Test
  public void hasName() {
    assertEquals( "Charley", nutritionist.getName() );
  }

  @Test
  public void zooHasEnclosure() {
    assertEquals( 2, zooKeeper.getNumEnclosures() );
  }

  @Test
  public void canAddFoodToBambooForest() {
    nutritionist.addFoodToEnclosure( burrito, bambooForest );
    int amountOfFood = bambooForest.getFoodStore().size();
    assertEquals( 1,  amountOfFood );
  }

  @Test
  public void canAddFoodtoArctic() {
    System.out.println(arctic.getFoodStore());
    nutritionist.addFoodToEnclosure( burrito, arctic );
    int amountOfFood = arctic.getFoodStore().size();
    assertEquals( 1, amountOfFood );
  }

}