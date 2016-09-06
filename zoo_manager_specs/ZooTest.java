import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class ZooTest {

  Zoo zoo;

  @Before
  public void before() {
    zoo = new Zoo();
  }

  @Test
  public void canGetEmpyEnclosureArrayList() {
    assertEquals( 0, zoo.getEnclosures().size() );
  }

}