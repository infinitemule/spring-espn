package com.infinitemule.espn.common.api;


public class CategoryLinks {

  private Link athletes;
  private Link teams;
  private Link sports;
  private Link leagues;
  
  public CategoryLinks() {
    
  }

  public Link getAthletes() {
    return athletes;
  }

  public void setAthletes(Link athletes) {
    this.athletes = athletes;
  }

  public Link getTeams() {
    return teams;
  }

  public void setTeams(Link teams) {
    this.teams = teams;
  }

  public Link getSports() {
    return sports;
  }

  public void setSports(Link sports) {
    this.sports = sports;
  }

  public Link getLeagues() {
    return leagues;
  }

  public void setLeagues(Link leagues) {
    this.leagues = leagues;
  }
    
  
}
