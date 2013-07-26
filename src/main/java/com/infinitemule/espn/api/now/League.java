package com.infinitemule.espn.api.now;

public class League {

  public static final League Boxing   = new League("boxing");
  public static final League Golf     = new League("golf");
  public static final League MLB      = new League("mlb");
  public static final League MMA      = new League("mma");
  public static final League NASCAR   = new League("nascar");
  public static final League NFL      = new League("nfl");
  public static final League NBL      = new League("nba");
  public static final League NHL      = new League("nhl");
  public static final League Olympics = new League("olympics");
  public static final League Racing   = new League("racing");
  public static final League Soccer   = new League("soccer");
  public static final League Tennis   = new League("tennis");
  public static final League WNBA     = new League("wnba");
  
  public static final League CollegeFootball         = new League("college-football");
  public static final League MensCollegeBasketball   = new League("mens-college-basketball");
  public static final League WomensCollegeBasketball = new League("womens-college-basketball");
    
  private String id;
  
  private League(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
    
}
