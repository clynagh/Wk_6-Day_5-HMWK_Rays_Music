import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;



public class ShopTest {


Sellable guitar;
Sellable piano;
Sellable trumpet;

@Before
public void before(){
shop = new Shop("Ray's Music Exchange");
guitar = new Guitar("Gibson","Cedar", "Brown", "String", 100, 200, 6);
piano = new Piano("Steinway", "Oak", "Black", "percussion", 1123, 2300, 88);
trumpet = new Trumpet("Vincent Bach", "Brass", "White", "Brass", 345, 789, 3);
}


@Test
public void hasName() {
  assertEquals("Ray's Music Exchange", shop.getName());
}

@Test
public void canAddStock () {
  this.stock.addStock(guitar);
  this.stock.addStock(piano);
  this.stock.addStock(trumpet);
  assertEquals(3, this.stock.countStock());
}

}

