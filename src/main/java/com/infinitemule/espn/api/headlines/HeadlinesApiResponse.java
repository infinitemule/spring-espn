/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.headlines;

import java.util.List;

import com.infinitemule.espn.common.api.PageableApiResponse;


public class HeadlinesApiResponse extends PageableApiResponse {

  private List<Headline> headlines;

  public List<Headline> getHeadlines() {
    return headlines;
  }

  public void setHeadlines(List<Headline> headlines) {
    this.headlines = headlines;
  }
  
  
}
