/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports;

import java.util.List;

import com.infinitemule.espn.api.athletes.Athlete;
import com.infinitemule.espn.api.teams.Group;
import com.infinitemule.espn.api.teams.Team;
import com.infinitemule.espn.common.api.Country;


/**
 * 
 */
public class League {
  
  private Integer id;
  private String  uid;
  private Integer groupId;
  
  private String name;
  private String shortName;
  private String abbreviation;
  
  private Season season;
  private Week   week;
  
  private List<Team>    teams;
  private List<Athlete> athletes;
  private List<Group>   groups;
  
  private String  isTournament;
  private Country country;
  
  
  public League() {
    
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }    

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
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
    
  public List<Athlete> getAthletes() {
    return athletes;
  }

  public void setAthletes(List<Athlete> athletes) {
    this.athletes = athletes;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  public String getIsTournament() {
    return isTournament;
  }

  public void setIsTournament(String isTournament) {
    this.isTournament = isTournament;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }
      
}
