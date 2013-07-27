/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports;

import java.util.List;

import com.infinitemule.espn.common.api.ApiResponse;
import com.infinitemule.espn.common.api.Links;



/**
 * 
 */
public class SportsApiResponse extends ApiResponse {

  private List<Sport> sports;   
  private Links links;
  
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }
  
  public List<Sport> getSports() {
    return sports;
  }

  public void setSports(List<Sport> sports) {
    this.sports = sports;
  }
}
