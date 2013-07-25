package com.infinitemule.espn.domain.sport.api;

import com.infinitemule.espn.common.api.Link;

public class TeamApiLinks {

  private Link teams;
  private Link news;
  private Link notes;
  
  public Link getTeams() {
    return teams;
  }
  
  public void setTeams(Link teams) {
    this.teams = teams;
  }
  
  public Link getNews() {
    return news;
  }
  
  public void setNews(Link news) {
    this.news = news;
  }
  
  public Link getNotes() {
    return notes;
  }
  
  public void setNotes(Link notes) {
    this.notes = notes;
  }
    
}
