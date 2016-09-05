import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class ZooKeeperTest {

  ZooKeeper zooKeeper;

  @Before
  public void before() {
    zooKeeper = new ZooKeeper("Raoul");
  }

  @Test
  public void hasName() {
    assertEquals( "Raoul", zooKeeper.getName() );
  }

}