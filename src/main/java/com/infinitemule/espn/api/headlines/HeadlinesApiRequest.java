package com.infinitemule.espn.api.headlines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;

import com.infinitemule.espn.common.api.AbstractApiRequest;
import com.infinitemule.espn.common.api.ApiUrls.Headlines;
import com.infinitemule.espn.common.api.City;
import com.infinitemule.espn.common.api.FantasySport;
import com.infinitemule.espn.common.api.Insider;
import com.infinitemule.espn.common.api.Leagues;
import com.infinitemule.espn.common.api.Region;
import com.infinitemule.espn.common.api.Sports;



public class HeadlinesApiRequest extends AbstractApiRequest {
  
  private String type;
  
  private City city;
  private FantasySport fantasySport;
  private Sports  sport;
  private Leagues league;
  
  private Integer id;
  private Integer teamId;
  private Integer athleteId;
  
  private String  dates;
  private Insider insider;
  private Region  region;
  
  private List<Disable> disable = new ArrayList<Disable>();
  
  /*
   * Headline type
   */
  
  public HeadlinesApiRequest news() {        
    setType(Headlines.news);    
    return this;
  }
  
  public HeadlinesApiRequest headlines() {    
    setType(Headlines.headlines);    
    return this;
  }
  
  public HeadlinesApiRequest topHeadlines() {    
    setType(Headlines.topHeadlines);    
    return this;
  }
  
  
  /*
   * Cities
   */
  
  public HeadlinesApiRequest forCities() {
    setMethod(Headlines.allCities + getType());
    return this;
  }
  
  public HeadlinesApiRequest forCity(City city) {
    setMethod(Headlines.byCity + getType());
    setCity(city);
    return this;
  }

  
  /*
   * Sports
   */

  public HeadlinesApiRequest forSports() {
    setMethod(Headlines.allSports + getType());
    return this;
  }
  
  public HeadlinesApiRequest forSport(Sports sport) {
    setMethod(Headlines.bySport + getType());
    setSport(sport);
    return this;
  }

  public HeadlinesApiRequest forSport(Sports sport, Leagues league) {
    setMethod(Headlines.bySportAndLeague + getType());
    setSport(sport);
    setLeague(league);
    return this;
  }

  public HeadlinesApiRequest team(Integer teamId) {
    setMethod(Headlines.byTeam + getType());
    setTeamId(teamId);
    return this;
  }

  public HeadlinesApiRequest athlete(Integer athleteId) {
    setMethod(Headlines.byAthlete + getType());
    setAthleteId(athleteId);
    return this;
  }

  public HeadlinesApiRequest story(Integer id) {
    setMethod(Headlines.byStory);
    setId(id);
    return this;
  }
  
  
  /*
   * Sections
   */
  
  public HeadlinesApiRequest forEspnW() {
    setMethod(Headlines.espnW + getType());
    return this;
  }
  
  public HeadlinesApiRequest forEspnMagazine() {
    setMethod(Headlines.espnMagazine + getType());
    return this;
  }
  
  
  public HeadlinesApiRequest forFantasySports() {
    setMethod(Headlines.allFantasy + getType());
    return this;
  }
  
  public HeadlinesApiRequest forFantasySport(FantasySport sport) {
    setMethod(Headlines.byFantasySport + getType());
    setFantasySport(sport);
    return this;
  }
  
  
  
  
  /*
   * Options
   */
  
  public HeadlinesApiRequest date(String date) {
    setDates(date.replaceAll("-", ""));
    return this;
  }
  
  public HeadlinesApiRequest insider(Insider insider) {
    setInsider(insider);
    return this;
  }

  public HeadlinesApiRequest disable(Disable... disable) {
    setDisable(Arrays.asList(disable));
    return this;
  }

  public HeadlinesApiRequest region(Region region) {
    setRegion(region);
    return this;
  }

  
  public String getDisableList() {
    
    List<String> ids = new ArrayList<String>();
    
    for(Disable d: disable) {
      ids.add(d.getId());
    }
    
    return Joiner.on(",").join(ids);
  }  
  
  
  @Override
  public Map<String, String> getUrlParams() {
    
    Map<String, String> urlParams = super.getUrlParams();        
    
    if(isSpecified(getCity())) {
      urlParams.put(Headlines.Params.city, getCity().getId());
    }
    
    if(isSpecified(getFantasySport())) {
      urlParams.put(Headlines.Params.sport, getFantasySport().getId());
    }
    
    if(isSpecified(getSport())) {
      urlParams.put(Headlines.Params.sport, getSport().getId());
    }
    
    if(isSpecified(getLeague())) {
      urlParams.put(Headlines.Params.league, getLeague().getId());
    }
    
    if(isSpecified(getTeamId())) {
      urlParams.put(Headlines.Params.teamId, getTeamId().toString());
    }

    if(isSpecified(getAthleteId())) {
      urlParams.put(Headlines.Params.athleteId, getAthleteId().toString());
    }

    if(isSpecified(getId())) {
      urlParams.put(Headlines.Params.id, getId().toString());
    }

    
    return urlParams;
    
  }
  
  @Override
  public Map<String, String> getQueryParams() {
    
    Map<String, String> queryParams = super.getQueryParams();
    
    if(isSpecified(getDates())) {
      queryParams.put(Headlines.Params.dates, getDates());
    }
    
    if(isSpecified(getInsider())) {
      queryParams.put(Headlines.Params.insider, getInsider().getId());
    }
    
    if(isSpecified(getDisable())) {
      queryParams.put(Headlines.Params.disable, getDisableList());
    }
    
    if(isSpecified(getRegion())) {
      queryParams.put(Headlines.Params.region, getRegion().getId());
    }
    
    
    queryParams.putAll(createPageableParams());
    
    return queryParams;
    
  }

  public String getType() {
    return type;
  }
    
  public void setType(String type) {
    this.type = type;  
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public FantasySport getFantasySport() {
    return fantasySport;
  }

  public void setFantasySport(FantasySport fantasySport) {
    this.fantasySport = fantasySport;
  }

  public String getDates() {
    return dates;
  }

  public void setDates(String dates) {
    this.dates = dates;
  }

  public Insider getInsider() {
    return insider;
  }

  public void setInsider(Insider insider) {
    this.insider = insider;
  }

  public List<Disable> getDisable() {
    return disable;
  }

  public void setDisable(List<Disable> disable) {
    this.disable = disable;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }

  public Sports getSport() {
    return sport;
  }

  public void setSport(Sports sport) {
    this.sport = sport;
  }

  public Leagues getLeague() {
    return league;
  }

  public void setLeague(Leagues league) {
    this.league = league;
  }

  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getAthleteId() {
    return athleteId;
  }

  public void setAthleteId(Integer athleteId) {
    this.athleteId = athleteId;
  }
            
}
