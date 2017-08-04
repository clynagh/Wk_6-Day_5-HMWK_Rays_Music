package music_shop_management;

public abstract class Instrument {

  String instrumentMaterial;
  String instrumentColour;
  String instrumentType;

  public Instrument(String instrumentMaterial, String instrumentColour, String instrumentType){
    this.instrumentMaterial = instrumentMaterial;
    this.instrumentColour = instrumentColour;
    this.instrumentType = instrumentType;
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
}

