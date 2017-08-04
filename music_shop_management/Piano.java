package music_shop_management;
import behaviours.*;


public class Piano extends Instrument implements Playable {


  int noOfKeys;

  public Piano(String instrumentMaterial, String instrumentColour, String instrumentType, int noOfKeys){
  super(instrumentMaterial, instrumentColour, instrumentType);
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
}