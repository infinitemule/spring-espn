package com.infinitemule.espn.domain.sport.api;

import java.util.ArrayList;
import java.util.List;

import com.infinitemule.espn.common.api.PageableApiResponse;

/**
 * 
 */
public class SportApiResponse extends PageableApiResponse {

  private List<Sport> sports = new ArrayList<Sport>();
  
  public List<Sport> getSports() {
    return sports;
  }

  public void setSports(List<Sport> sports) {
    this.sports = sports;
  }
}
