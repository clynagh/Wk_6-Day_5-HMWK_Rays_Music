package music_shop_management;
import java.util.ArrayList;
import behaviours.*;

public class Shop {
  private String name;
  private ArrayList<Sellable> stock;

public Shop(String name) {
  this.name = name;
  this.stock = new ArrayList<Sellable>();
}

public String getName() {
  return this.name;
}


public int countStock() {
  return this.stock.size();
}

public void addStock(Sellable item) {
  this.stock.add(item);
}


}







