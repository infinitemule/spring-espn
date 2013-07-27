package com.infinitemule.espn.api.sports;

import java.util.Map;

import com.infinitemule.espn.common.api.AbstractApiRequest;
import com.infinitemule.espn.common.api.ApiUrls;
import com.infinitemule.espn.common.api.Leagues;
import com.infinitemule.espn.common.api.Sports;


public class SportsApiRequest extends AbstractApiRequest {

  private Sports  sport;
  private Leagues league;
  
  public SportsApiRequest allSports() {
    setMethod(ApiUrls.Sports.all);    
    return this;
  }
  
  public SportsApiRequest sport(Sports sport) {    
    setMethod(ApiUrls.Sports.byName);
    setSport(sport);
    return this;
  }
    
  public SportsApiRequest league(Leagues league) {    
    setMethod(ApiUrls.Sports.byNameAndLeague);
    setLeague(league);  
    return this;
  }

  @Override
  public Map<String, String> getUrlParams() {
    
    Map<String, String> urlParams = super.getUrlParams();

    if(isSpecified(getSport())) {
      urlParams.put(ApiUrls.Sports.Params.sport,  getSport().getId());  
    }
    
    if(isSpecified(getLeague())) {
      urlParams.put(ApiUrls.Sports.Params.league, getLeague().getId());  
    }
    
    
    return urlParams;
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
    
}
