import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;


public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before() {
    trumpet = new Trumpet("Brass", "White", "Brass", 3);
  }

  @Test
  public void noOfValves(){
    assertEquals(3, trumpet.noOfValves());
  }

  @Test
  public void hasInstrumentMaterial(){
    assertEquals("Brass", trumpet.instrumentMaterial());
  }

  @Test
  public void hasInsturmentSound(){
    assertEquals("Toot Toot Toot!!!", trumpet.instrumentSound());
  }

}












