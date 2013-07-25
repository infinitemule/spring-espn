/**
 * Spring ESPN
 *  
 */
package com.infinitemule.espn.domain.sport.api;

import com.infinitemule.espn.common.api.Links;


/**
 * 
 */
public class SportsApiResponse extends SportApiResponse {
 
  private Links links;
      
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }
      
}
