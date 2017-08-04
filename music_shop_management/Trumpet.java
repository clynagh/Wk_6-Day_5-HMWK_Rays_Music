package music_shop_management;
import behaviours.*;


public class Trumpet extends Instrument implements Playable, Sellable {

  int noOfValves;

  public Trumpet(String description, String instrumentMaterial, String instrumentColour, String instrumentType, int wholesale, int retail, int noOfValves){
  super(description, instrumentMaterial, instrumentColour, instrumentType, wholesale, retail);
  this.noOfValves = noOfValves;
}

public String instrumentSound(){
  return "Toot Toot Toot!!!";
}

public int noOfValves(){
  return this.noOfValves;
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
