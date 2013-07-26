package com.infinitemule.espn.common.api;

public class FantasySport {

  public static final FantasySport Baseball   = new FantasySport("baseball",   "Baseball");
  public static final FantasySport Basketball = new FantasySport("basketball", "Basketball");
  public static final FantasySport Football   = new FantasySport("football",   "Football");
  public static final FantasySport Hockey     = new FantasySport("hockey",     "Hockey");
  
  private String id;
  private String name;
  
  private FantasySport(String id, String name) {
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
