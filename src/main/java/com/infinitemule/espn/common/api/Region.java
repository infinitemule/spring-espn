package com.infinitemule.espn.common.api;

public class Region {

  public static final Region AR = new Region("ar");
  public static final Region CO = new Region("co");
  public static final Region GB = new Region("gb");
  public static final Region MX = new Region("mx");
  public static final Region US = new Region("us");
  
  private String id;
  
  private Region(String id) {
    this.id = id;
  }
 
  public String getId() {
    return id;
  }
  
}