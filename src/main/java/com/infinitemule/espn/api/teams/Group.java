/*
 * 
 */
package com.infinitemule.espn.api.teams;

import java.util.List;

import com.infinitemule.espn.api.sports.Season;
import com.infinitemule.espn.api.sports.Week;

/**
 * 
 */
public class Group {

  private Integer id;
  private Integer groupId;
  
  private String name;
  private String shortName;
  private String abbreviation;
  
  private Week   week;
  private Season season;
  
  private List<Group> groups;
  
  /*
  "groups": [ … ]
  */
  
  public Group() {
    
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

  public Week getWeek() {
    return week;
  }

  public void setWeek(Week week) {
    this.week = week;
  }

  public Season getSeason() {
    return season;
  }

  public void setSeason(Season season) {
    this.season = season;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }
        
}
