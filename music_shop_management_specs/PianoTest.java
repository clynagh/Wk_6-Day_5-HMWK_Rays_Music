import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Oak", "Black", "percussion", 88);
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
}