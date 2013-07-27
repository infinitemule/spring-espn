/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.headlines;


public enum Disable {
    
  Audio      ("audio"),
  Categories ("categories"),    
  Keywords   ("keywords"),
  MobileStory("mobileStory"),
  Related    ("related"),
  Story      ("story");
  
  private String id;
 
  private Disable(String id) { 
    this.id = id; 
  }
  
  public String getId() { 
    return id; 
  }
  
}