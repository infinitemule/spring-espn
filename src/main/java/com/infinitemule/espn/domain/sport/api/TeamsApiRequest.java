/*
 * 
 */
package com.infinitemule.espn.domain.sport.api;

import java.util.List;

import com.infinitemule.espn.common.api.PageableApiRequest;

/**
 * 
 */
public class TeamsApiRequest extends PageableApiRequest {
  
  private String sport  = null;    
  private String league = null;
    
  private Integer          group   = null;  
  private List<TeamOption> options = null;

  
  public TeamsApiRequest() {
    
  }
  
  public TeamsApiRequest(String sport, String league) {
    this(sport, league, null, null);
  }

  public TeamsApiRequest(String sport, String league, List<TeamOption> options) {
    this(sport, league, null, options);
  }

  public TeamsApiRequest(String sport, 
                         String league, 
                         Integer group, 
                         List<TeamOption> options) {
    setSport(sport);
    setLeague(league);
    setGroup(group);
    setOptions(options);
  }
  

  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public String getLeague() {
    return league;
  }

  public void setLeague(String league) {
    this.league = league;
  }

  public Integer getGroup() {
    return group;
  }

  public void setGroup(Integer group) {
    this.group = group;
  }

  public List<TeamOption> getOptions() {
    return options;
  }
  
  public void setOptions(List<TeamOption> options) {
    this.options = options;
  }
    
}
