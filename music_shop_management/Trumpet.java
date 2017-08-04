package music_shop_management;
import behaviours.*;


public class Trumpet extends Instrument implements Playable, Sellable {

  int noOfValves;

  public Trumpet(String instrumentMaterial, String instrumentColour, String instrumentType, int noOfValves){
  super(instrumentMaterial, instrumentColour, instrumentType);
  this.noOfValves = noOfValves;
}

public String instrumentSound(){
  return "Toot Toot Toot!!!";
}

public int getnoOfValaves(){
  return this.noOfValves;
}
}
