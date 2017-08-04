import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Cedar", "Brown", "String", 6);
  }

  @Test
  public void noOfStrings(){
    assertEquals(6, guitar.noOfStrings());
  }
  
  @Test
  public void hasInstrumentMaterial(){
    assertEquals("Cedar", guitar.instrumentMaterial());
  }

  @Test
  public void hasInstrumentSound(){
    assertEquals("Strummmmm", guitar.instrumentSound());
  }
}