package com.infinitemule.espn.common.api;

public enum Leagues {

  MLB   ("mlb",    "Major Leauge Baseball"),
  NASCAR("nascar", "NASCAR"),
  NFL   ("nfl",    "NFL");
  
  private String id;
  private String name;
  
  private Leagues(String id, String name) { 
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
