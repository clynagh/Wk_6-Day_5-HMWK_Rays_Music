package music_shop_management;
import behaviours.*;


public class Guitar extends Instrument implements Playable, Sellable {


int noOfStrings;

  public Guitar(String instrumentMaterial, String instrumentColour, String instrumentType, int noOfStrings){
    super(instrumentMaterial, instrumentColour, instrumentType);
    this.noOfStrings = noOfStrings;
  }

  public String instrumentSound(){
    return "Strummmmm";
  }

  public int noOfStrings(){
    return this.noOfStrings;
  }

  public String instrumentMaterial(){
    return this.instrumentMaterial;
  }
  
}

