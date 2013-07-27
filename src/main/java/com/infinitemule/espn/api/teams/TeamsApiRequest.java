/*
 * 
 */
package com.infinitemule.espn.api.teams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.infinitemule.espn.common.api.AbstractApiRequest;
import com.infinitemule.espn.common.api.ApiUrls;
import com.infinitemule.espn.common.api.Leagues;
import com.infinitemule.espn.common.api.Sports;

/**
 * 
 */
public class TeamsApiRequest extends AbstractApiRequest {
  
  private Sports  sport  = null;    
  private Leagues league = null;
    
  private Integer          group   = null;  
  private List<TeamOption> options = null;

  
  public TeamsApiRequest() {
    
  }

  public TeamsApiRequest sport(Sports sport) {
    setMethod(ApiUrls.Teams.bySport);
    setSport(sport);
    return this;
  }
  
  public TeamsApiRequest league(Leagues league) {
    setMethod(ApiUrls.Teams.bySportAndLeague);
    setLeague(league);
    return this;
  }

  public TeamsApiRequest group(Integer group) {
    setGroup(group);
    return this;
  }

  public TeamsApiRequest options(TeamOption ... options) {
    setOptions(Arrays.asList(options));
    return this;
  }
  
  public String getOptionsList() {
    
    List<String> ids = new ArrayList<String>();
    
    for(TeamOption o: getOptions()) {
      ids.add(o.getName());
    }
    
    return Joiner.on(",").join(ids);
    
  }

  @Override
  public Map<String, String> getUrlParams() {
    
    Map<String, String> urlParams = super.getUrlParams();
    
    if(isSpecified(getSport())) {
      urlParams.put(ApiUrls.Teams.Params.sport, getSport().getId());
    }
    
    if(isSpecified(getLeague())) {
      urlParams.put(ApiUrls.Teams.Params.league, getLeague().getId());
    }
    
    return urlParams;
  }
  
  
  @Override
  public Map<String, String> getQueryParams() {
   
    Map<String, String> queryParams = super.getQueryParams();
    
    if(isSpecified(getGroup())) {
      queryParams.put(ApiUrls.Teams.Params.groups, getGroup().toString());
    }
    
    if(isSpecified(getOptions())) {
      queryParams.put(ApiUrls.Teams.Params.options, getOptionsList());
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
