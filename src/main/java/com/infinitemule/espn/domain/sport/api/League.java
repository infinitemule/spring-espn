/**
 * Spring ESPN
 */
package com.infinitemule.espn.domain.sport.api;

import java.util.List;


/**
 * 
 */
public class League {
  
  private Integer id;
  private Integer groupId;
  
  private String name;
  private String shortName;
  private String abbreviation;
  
  private Season season;
  private Week   week;
  
  private List<Team>  teams;
  private List<Group> groups;
  
  
  public League() {
    
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public Season getSeason() {
    return season;
  }

  public void setSeason(Season season) {
    this.season = season;
  }

  public Week getWeek() {
    return week;
  }

  public void setWeek(Week week) {
    this.week = week;
  }

  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }
    
}
