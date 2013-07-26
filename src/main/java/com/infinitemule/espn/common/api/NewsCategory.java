package com.infinitemule.espn.common.api;


/**
 * 
 */
public class NewsCategory {
  
  private String uid;
  private String description;
  private String type;
  
  private Integer  sportId;
  private Category sport;
  
  private Integer  teamId;
  private Category team;
  
  private Integer  leagueId;
  private Category league;
  
  private Integer  athleteId;
  private Category athlete;

  private Integer topicId;
  
  private Integer fantasyPlayerId;
  private Integer fantasyTeamId;   
  
  
  public NewsCategory() {
    
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getSportId() {
    return sportId;
  }

  public void setSportId(Integer sportId) {
    this.sportId = sportId;
  }

  public Category getSport() {
    return sport;
  }

  public void setSport(Category sport) {
    this.sport = sport;
  }

  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  public Category getTeam() {
    return team;
  }

  public void setTeam(Category team) {
    this.team = team;
  }

  public Integer getLeagueId() {
    return leagueId;
  }

  public void setLeagueId(Integer leagueId) {
    this.leagueId = leagueId;
  }

  public Category getLeague() {
    return league;
  }

  public void setLeague(Category league) {
    this.league = league;
  }

  public Integer getAthleteId() {
    return athleteId;
  }

  public void setAthleteId(Integer athleteId) {
    this.athleteId = athleteId;
  }

  public Category getAthlete() {
    return athlete;
  }

  public void setAthlete(Category athlete) {
    this.athlete = athlete;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public Integer getTopicId() {
    return topicId;
  }

  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }

  public Integer getFantasyPlayerId() {
    return fantasyPlayerId;
  }

  public void setFantasyPlayerId(Integer fantasyPlayerId) {
    this.fantasyPlayerId = fantasyPlayerId;
  }

  public Integer getFantasyTeamId() {
    return fantasyTeamId;
  }

  public void setFantasyTeamId(Integer fantasyTeamId) {
    this.fantasyTeamId = fantasyTeamId;
  }
        
}
