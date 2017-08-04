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
    assertEquals(3, trumpet.getnoOfValaves());
  }

  @Test
  public void hasInstrumentMaterial(){
    assertEquals("Brass", trumpet.getInstrumentMaterial());
  }

  @Override
  public void hasInsturmentSound(){
    assertEquals("Toot Toot Toot!!!", trumpet.hasInsturmentSound());
  }

}












