package com.infinitemule.espn.common.api;

public class Output {

  public static final Output JSON = new Output("application/json");
  public static final Output XML  = new Output("text/xml");
  
  private String type;

  private Output(String type) {
    setType(type);
  }
  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }  
  
}
