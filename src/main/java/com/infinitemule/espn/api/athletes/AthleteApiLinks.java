/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.athletes;

import com.infinitemule.espn.common.api.ApiLinks;
import com.infinitemule.espn.common.api.Link;

/**
 * 
 */
public class AthleteApiLinks extends ApiLinks {

  private Link athletes;
  private Link news;
  
  public Link getAthletes() {
    return athletes;
  }
  
  public void setAthletes(Link athletes) {
    this.athletes = athletes;
  }
  
  public Link getNews() {
    return news;
  }
  
  public void setNews(Link news) {
    this.news = news;
  }
    
}
