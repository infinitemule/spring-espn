package com.infinitemule.espn.api.now;

public enum Disable {
  
  BreakingNews ("breakingnews"),
  Metrics      ("metrics"),
  Categories   ("categories");
  
  private String id;
  
  private Disable(String id) { 
    this.id = id; 
  }
  
  public String getId() { 
    return id; 
  }
  
}