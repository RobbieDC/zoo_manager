import static org.junit.Assert.*;
import org.junit.*;
import zoo_manager.*;

public class PandaTest {

  Panda panda;

  @Before
  public void befor() {
    panda = new Panda("Polly", "female", 1000.00);
  }

  @Test
  public void hasName() {
    String name = panda.getName();
    assertEquals( "Polly", name );
  }

}