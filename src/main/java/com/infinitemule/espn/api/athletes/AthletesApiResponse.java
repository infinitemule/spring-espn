/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.athletes;

import java.util.List;

import com.infinitemule.espn.api.sports.Sport;
import com.infinitemule.espn.common.api.PageableApiResponse;


public class AthletesApiResponse extends PageableApiResponse {

  private List<Sport> sports;
  
  
  public List<Sport> getSports() {
    return sports;
  }

  public void setSports(List<Sport> sports) {
    this.sports = sports;
  }
    
  
}
