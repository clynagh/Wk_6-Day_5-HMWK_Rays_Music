package music_shop_management;

public abstract class Instrument {

  String description;
  String instrumentMaterial;
  String instrumentColour;
  String instrumentType;
  int wholesale;
  int retail;


  public Instrument(String description, String instrumentMaterial, String instrumentColour, String instrumentType, int wholesale, int retail){
    this.description = description;
    this.instrumentMaterial = instrumentMaterial;
    this.instrumentColour = instrumentColour;
    this.instrumentType = instrumentType;
    this.wholesale = wholesale;
    this.retail = retail;
  }

  public String getDecription(){
    return this.description;
  }

  public String getInstrumentMaterial(){
    return this.instrumentMaterial;
  }

  public String getInstrumentColour(){
    return this.instrumentColour;
  }

  public String getInstrumentType(){
    return this.instrumentType;
  }

  public int getWholesale(){
    return this.wholesale;
  }

  public int getRetail(){
    return this.retail;
  }
}

