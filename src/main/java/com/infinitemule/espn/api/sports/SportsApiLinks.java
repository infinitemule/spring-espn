/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports;

import com.infinitemule.espn.common.api.Link;
import com.infinitemule.espn.common.api.ApiLinks;

/**
 * 
 */
public class SportsApiLinks extends ApiLinks {

  private Link sports;
  private Link leagues;
  private Link teams;
  private Link athletes;
  private Link standings;
  private Link medals;
  
  
  
  /**
   * 
   */
  public String getSportsUrl() {
    return getUrl(getSports());    
  }
  
  
  /*
   * 
   */

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

  public Link getTeams() {
    return teams;
  }

  public void setTeams(Link teams) {
    this.teams = teams;
  }

  public Link getAthletes() {
    return athletes;
  }

  public void setAthletes(Link athletes) {
    this.athletes = athletes;
  }

  public Link getStandings() {
    return standings;
  }

  public void setStandings(Link standings) {
    this.standings = standings;
  }

  public Link getMedals() {
    return medals;
  }

  public void setMedals(Link medals) {
    this.medals = medals;
  }       
  
}
