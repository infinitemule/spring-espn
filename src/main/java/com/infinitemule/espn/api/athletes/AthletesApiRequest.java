/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.athletes;

import java.util.Map;

import com.infinitemule.espn.common.api.AbstractApiRequest;
import com.infinitemule.espn.common.api.ApiUrls;
import com.infinitemule.espn.common.api.Groups;
import com.infinitemule.espn.common.api.Language;
import com.infinitemule.espn.common.api.Leagues;
import com.infinitemule.espn.common.api.Sports;
import com.infinitemule.espn.common.api.ApiUrls.Common;

/**
 * 
 */
public class AthletesApiRequest extends AbstractApiRequest {

  private Integer athleteId;
  private Sports  sport;
  private Leagues league;
  
  private Groups groups;
  
  
  public AthletesApiRequest() {
    
  }

  public AthletesApiRequest id(Integer athleteId) {
    setMethod(ApiUrls.Athletes.byAthlete);
    setAthleteId(athleteId);
    return this;
  }

  
  public AthletesApiRequest sport(Sports sport) {
    setMethod(ApiUrls.Athletes.bySport);
    setSport(sport);
    return this;
  }
  
  public AthletesApiRequest league(Leagues league) {
    setMethod(ApiUrls.Athletes.bySportAndLeague);
    setLeague(league);
    return this;
  }
  
  public AthletesApiRequest groups(Groups groups) {
    setGroups(groups);
    return this;
  }
  
  public AthletesApiRequest language(Language language) {
    setLanguage(language);
    return this;
  }
  
  
  @Override
  public Map<String, String> getUrlParams() {
    
    Map<String, String> urlParams = super.getUrlParams();
    
    if(isSpecified(getSport())) {
      urlParams.put(ApiUrls.Athletes.Params.sport, getSport().getId());
    }
    
    if(isSpecified(getLeague())) {
      urlParams.put(ApiUrls.Athletes.Params.league, getLeague().getId());
    }
    
    if(isSpecified(getAthleteId())) {
      urlParams.put(ApiUrls.Athletes.Params.id, getAthleteId().toString());
    }
    
    return urlParams;
    
  }
  
  @Override
  public Map<String, String> getQueryParams() {
   
    Map<String, String> queryParams = super.getQueryParams();
  
    if(isSpecified(getGroups())) {
      queryParams.put(ApiUrls.Athletes.Params.groups, getGroups().getId().toString());
    }
    
    if(isSpecified(getLanguage())) {
      queryParams.put(Common.Params.lang, getLanguage().getAbbr());
    }
    

    return queryParams;
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

  public Integer getAthleteId() {
    return athleteId;
  }

  public void setAthleteId(Integer athleteId) {
    this.athleteId = athleteId;
  }

  public Groups getGroups() {
    return groups;
  }

  public void setGroups(Groups groups) {
    this.groups = groups;
  }
    
}
