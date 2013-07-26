package com.infinitemule.espn.common.api;

public enum League {

  MLB   ("mlb",    "Major Leauge Baseball"),
  NASCAR("nascar", "NASCAR");
  
  private String id;
  private String name;
  
  private League(String id, String name) { 
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
