import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;
// import java.util.*;

public class ZooKeeperTest {

  Zoo zoo;
  ZooKeeper zooKeeper;
  Enclosure arctic;
  Enclosure bambooForest;
  Animal panda;

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

  @Test
  public void canAddAnimalToEnclosure() {
    zooKeeper.addEnclosure(arctic);
    zooKeeper.addEnclosure(bambooForest);
    Enclosure specifiedEnclosure = zooKeeper.getEnclosure( bambooForest );
    zooKeeper.addAnimalToenclosure( panda, specifiedEnclosure );
    BambooForest bambooForestWithAnimal = (BambooForest) specifiedEnclosure
    assertEquals( 1, bambooForestWithAnimal.getNumOccupants() );
  }

}