/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.now;

/**
 * The Now API uses a different sport/league scheme than
 * the Headlines API.
 */
public enum NowLeague {

  Boxing   ("boxing"),
  Golf     ("golf"),
  MLB      ("mlb"),
  MMA      ("mma"),
  NASCAR   ("nascar"),
  NFL      ("nfl"),
  NBL      ("nba"),
  NHL      ("nhl"),
  Olympics ("olympics"),
  Racing   ("racing"),
  Soccer   ("soccer"),
  Tennis   ("tennis"),
  WNBA     ("wnba"),
  
  CollegeFootball         ("college-football"),
  MensCollegeBasketball   ("mens-college-basketball"),
  WomensCollegeBasketball ("womens-college-basketball");
    
  private String id;
  
  private NowLeague(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
    
}
