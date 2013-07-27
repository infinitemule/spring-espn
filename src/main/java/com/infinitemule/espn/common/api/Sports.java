package com.infinitemule.espn.common.api;

public enum Sports {

  ActionSports("action-sports", "Action Sports"),
  Baseball    ("baseball",      "Baseball"),
  Basketball  ("basketball",    "Basketball"),
  Boxing      ("boxing",        "Boxing"),
  Football    ("football",      "Football"),
  Golf        ("golf",          "Golf"),
  Hockey      ("hockey",        "Hockey"),
  HorseRacing ("horse-racing",  "Horse Racing"),
  MMA         ("mma",           "Mixed Martial Arts"),
  Racing      ("racing",        "Racing"),
  Olympics    ("olympics",      "Olympics"),
  Soccer      ("soccer",        "Soccer"),
  Tennis      ("tennis",        "Tennis");
  
  private String id;
  private String name;
  
  private Sports(String id, String name) { 
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
  
