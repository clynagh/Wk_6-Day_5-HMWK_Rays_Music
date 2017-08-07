import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;
import behaviours.*;

public class ShopTest {

  Shop shop;
  Sellable item;

@Before
public void before(){
shop = new Shop("Ray's Music Exchange");
item = new Guitar("Gibson","Cedar", "Brown", "String", 100, 200, 6);

}

@Test
public void hasName() {
  assertEquals("Ray's Music Exchange", shop.getName());
}

@Test
public void stockStartsEmpty() {
  assertEquals(0, shop.countStock());
}

@Test
public void canAddStock () {
  this.shop.addStock(item);
  assertEquals(1, this.shop.countStock());
}

}



