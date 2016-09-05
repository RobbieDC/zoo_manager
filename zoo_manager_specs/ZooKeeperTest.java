import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class ZooKeeperTest {

  ZooKeeper zooKeeper;
  Zoo zoo;

  @Before
  public void before() {
    zoo = new Zoo();
    zooKeeper = new ZooKeeper("Raoul", zoo);
  }

  @Test
  public void hasName() {
    assertEquals( "Raoul", zooKeeper.getName() );
  }

  @Test
  public void hasZoo() {
    assertEquals( zoo, zooKeeper.getZoo() );
  }

}