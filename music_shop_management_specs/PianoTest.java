import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Steinway", "Oak", "Black", "percussion", 1123, 2300, 88);
  }

  @Test
  public void noOfKeys(){
    assertEquals(88, piano.noOfKeys());
  }
  
  @Test
  public void hasInstrumentMaterial(){
    assertEquals("Oak", piano.instrumentMaterial());
  }

  @Test
  public void hasInstrumentSound(){
    assertEquals("tinkle, tinkle, tinkle!", piano.instrumentSound());
  }

  @Test
  public void hasDescription(){
    assertEquals("Steinway", piano.description());
  }

  @Test
  public void hasCalculateMarkUp(){
    assertEquals(1177, piano.calculateMarkup());
  }
}