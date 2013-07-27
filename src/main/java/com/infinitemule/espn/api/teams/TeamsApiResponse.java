/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.teams;

import java.util.List;

import com.infinitemule.espn.api.sports.Sport;
import com.infinitemule.espn.common.api.PageableApiResponse;

/**
 * 
 */
public class TeamsApiResponse extends PageableApiResponse {

  
  private List<Sport> sports;
  // rosterType
  // dates
  
  public TeamsApiResponse() {
    
  }

  public List<Sport> getSports() {
    return sports;
  }

  public void setSports(List<Sport> sports) {
    this.sports = sports;
  }
    
      
}
