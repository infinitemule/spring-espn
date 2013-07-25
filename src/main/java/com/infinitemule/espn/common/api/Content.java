package com.infinitemule.espn.common.api;

public class Content {

  public static final Content Alert = new Content("alert");
  public static final Content Blog  = new Content("blog");
  public static final Content Elias = new Content("elias");
  
  public static final Content Game       = new Content("game");
  public static final Content GameFinal  = new Content("gamefinal");
  public static final Content GamePeriod = new Content("gameperiod");
  public static final Content GameScore  = new Content("gamescore");
  public static final Content GameStart  = new Content("gamestart");
  
  public static final Content Podcast = new Content("podcat");
  public static final Content Story   = new Content("story");
  public static final Content Tweet   = new Content("tweet");
  public static final Content Video   = new Content("video");
  
  
  private String id;
  
  private Content(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
    
}
