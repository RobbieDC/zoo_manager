import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;
// import java.util.*;

public class ZooKeeperTest {

  Zoo zoo;
  ZooKeeper zooKeeper;
  Enclosure arctic;

  @Before
  public void before() {
    zoo = new Zoo();
    zooKeeper = new ZooKeeper("Raoul", zoo);
    arctic = new Arctic( 5 );
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

  // @Test
  // public void canAddEnclosure() {
  //   assertEquals(1, )
  // }

  // @Test
  // public void canGetEnclosure() {
  //   assertEquals( arctic, zooKeeper.getEnclosure( arctic ) );
  // }

  // @Test
  // public void canAddEnclosuresToZoo() {
  //   ArrayList<Enclosures> enclosures = zoo.getEnclosures();
  //   assertEquals(  );
  // }

}