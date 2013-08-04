package com.infinitemule.espn.common.api;

public enum Groups {
  AFC      (8),
  AFC_EAST (4),
  AFC_NORTH(12),
  AFC_SOUTH(13),
  AFC_WEST (6);
  
  private Integer id;
  
  private Groups(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }
    
}
