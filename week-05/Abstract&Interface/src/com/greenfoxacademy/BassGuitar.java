package com.greenfoxacademy;

public class BassGuitar extends StringedInstrument{

  public BassGuitar(){
    numberOfStrings = 4;
    name = "Bass Guitar";
  }
  public BassGuitar(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
    name = "Bass Guitar";
  }
  @Override
  public void sound() {
    System.out.println("Dumm-duum-duum");
  }
}
