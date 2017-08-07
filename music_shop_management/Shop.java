package music_shop_management;
import java.util.ArrayList;
import behaviours.*;

public class Shop {
  private String name;
  private ArrayList<Sellable> stock;

public Shop() {
  this.name = name;
this.stock = new ArrayList<Sellable>();
}

public String getName() {
  return this.name;
}

public void addStock(Sellable item) {
  this.stock.add(item);
}

public int countStock() {
  return this.stock.size();
}

public int calculateMarkup(){
  return this.retail - this.wholesale;
}

}






