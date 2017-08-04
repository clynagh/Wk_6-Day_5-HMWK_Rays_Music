package music_shop_management;
import behaviours.*;


public class Guitar extends Instrument implements Playable, Sellable {


int noOfStrings;

  public Guitar(String description, String instrumentMaterial, String instrumentColour, String instrumentType, int wholesale, int retail, int noOfStrings){
    super(description, instrumentMaterial, instrumentColour, instrumentType, wholesale, retail);
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

  public String description(){
    return this.description;
  }

  public int calculateMarkup(){
    return this.retail - this.wholesale;
  }
  
}

