import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;
import behaviours.*;
// import java.util.*;

public class ZooKeeperTest {

  Zoo zoo;
  ZooKeeper zooKeeper;
  Arctic arctic;
  BambooForest bambooForest;
  BambooForestable panda;
  Arcticable polarBear;

  @Before
  public void before() {
    zoo = new Zoo();
    zooKeeper = new ZooKeeper("Raoul", zoo);
    arctic = new Arctic( 5 );
    bambooForest = new BambooForest( 7 );
    panda = new Panda("Polly", SexType.FEMALE, 1000.00);
  }

  @Test
  public void hasName() {
    assertEquals( "Raoul", zooKeeper.getName() );
  }

  @Test
  public void hasZoo() {
    assertEquals( zoo, zooKeeper.getZoo() );
  }

  @Test
  public void canGetNumEnclosures() {
    assertEquals( 0, zooKeeper.getNumEnclosures() );
  }

  @Test
  public void canAddEnclosure() {
    zooKeeper.addEnclosure(arctic);
    assertEquals( 1, zooKeeper.getNumEnclosures() );
  }

  @Test
  public void canGetEnclosure() {
    zooKeeper.addEnclosure(arctic);
    zooKeeper.addEnclosure(bambooForest);
    Enclosure specifiedEnclosure = zooKeeper.getEnclosure( arctic );
    assertEquals( arctic, specifiedEnclosure );
  }

  // @Test
  // public void canAddAnimalToEnclosure() {
  //   zooKeeper.addEnclosure(arctic);
  //   zooKeeper.addEnclosure(bambooForest);
  //   Enclosure specifiedEnclosure = zooKeeper.getEnclosure( bambooForest );
  //   zooKeeper.addAnimalToBambooForest( panda, specifiedEnclosure );
  //   BambooForest bambooForestWithAnimal = (BambooForest) specifiedEnclosure;
  //   assertEquals( 1, bambooForestWithAnimal.getNumOccupants() );
  // }

  @Test
  public void canAddAnimalToBambooForest() {
    zooKeeper.addEnclosure(bambooForest);
    zooKeeper.addAnimalToBambooForest( panda, bambooForest );
    assertEquals(1, bambooForest.getNumOccupants() );
  }

  @Test
  public void canAddAnimalToArctic() {
    zooKeeper.addEnclosure(arctic);
    zooKeeper.addAnimalToArctic( polarBear, arctic );
    assertEquals(1, arctic.getNumOccupants() );
  }

}