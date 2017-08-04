package music_shop_management;
import behaviours.*;


public class Piano extends Instrument implements Playable, Sellable {


  int noOfKeys;

  public Piano(String description, String instrumentMaterial, String instrumentColour, String instrumentType, int wholesale, int retail, int noOfKeys){
  super(description, instrumentMaterial, instrumentColour, instrumentType, wholesale, retail);
  this.noOfKeys = noOfKeys;
}

public String instrumentSound(){
  return "tinkle, tinkle, tinkle!";
}

public int noOfKeys(){
  return this.noOfKeys;
}
public String instrumentMaterial(){
  return this.instrumentMaterial;
}

public String description(){
  return this.description;
}

public int calculateMarkup(){
  return this.retail - this.wholesale;
}

}