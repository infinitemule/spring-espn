package com.infinitemule.espn.api.now;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.infinitemule.espn.common.api.AbstractApiRequest;
import com.infinitemule.espn.common.api.ApiUrls;
import com.infinitemule.espn.common.api.ApiUrls.Common;
import com.infinitemule.espn.common.api.ApiUrls.Now;
import com.infinitemule.espn.common.api.Content;
import com.infinitemule.espn.common.api.Language;
import com.infinitemule.espn.common.api.Region;


/**
 * 
 * {@link http://developer.espn.com/docs/now}
 * 
 * Notes:
 * - Leagues can only be specified with now method, not top or popular.
 * - Groups can only be specified when league is  mens-college-basketball, 
 *   womens-college-basketball, or college-football.
 * - Only region accepted is GB, if league is soccer.
 * - Teams and groups only accept a single value for now.
 */
public class NowApiRequest extends AbstractApiRequest {
    
  private NowLeague     league;
  private Content       content;
  private List<Disable> disable = new ArrayList<Disable>();

  private Integer teams;  
  private Integer groups;
  
  
  
  public NowApiRequest() {
    
  }

  public NowApiRequest latest() {
    setMethod(ApiUrls.Now.latest);
    return this;
  }
  
  public NowApiRequest top() {
    setMethod(ApiUrls.Now.top);
    return this;
  }
  
  public NowApiRequest popular() {
    setMethod(ApiUrls.Now.popular);
    return this;
  }

  
  public NowApiRequest league(NowLeague league) {
    setLeague(league);
    return this;
  }
  
  public NowApiRequest groups(Integer groups) {
    setGroups(groups);
    return this;
  }
  
  public NowApiRequest teams(Integer teams) {
    setTeams(teams);
    return this;
  }
    
  public NowApiRequest content(Content content) {
    setContent(content);
    return this;
  }

  public NowApiRequest disable(Disable... disable) {
    setDisable(Arrays.asList(disable));
    return this;
  }

  
  public NowApiRequest region(Region region) {
    setRegion(region);
    return this;
  }

  
  public NowApiRequest limit(Integer limit) {
    setLimit(limit);
    return this;
  }

  public NowApiRequest offset(Integer offset) {
    setOffset(offset);
    return this;
  }
  
  public NowApiRequest language(Language language) {
    setLanguage(language);
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
  public Map<String, String> getQueryParams() {

    Map<String, String> queryParams = Maps.newHashMap();
    
    if(isSpecified(getLeague())) {
      queryParams.put(Now.Params.leagues, getLeague().getId());
    }
    
    if(isSpecified(getGroups())) {
      queryParams.put(Now.Params.groups, getGroups().toString());
    }
    
    if(isSpecified(getTeams())) {
      queryParams.put(Now.Params.teams, getTeams().toString());
    }

    if(isSpecified(getContent())) {
      queryParams.put(Now.Params.content, getContent().getId());
    }

    if(isSpecified(getDisable())) {
      queryParams.put(Now.Params.disable, getDisableList());
    }
    
    if(isSpecified(getLanguage())) {
      queryParams.put(Common.Params.lang, getLanguage().getAbbr());
    }
    
    if(isSpecified(getRegion())) {
      queryParams.put(Now.Params.region, getRegion().getId());
    }
    
    queryParams.putAll(createPageableParams());
    
    return queryParams;    
    
  }
    
  
  /*
   * 
   */

  public Integer getGroups() {
    return groups;
  }

  public void setGroups(Integer groups) {
    this.groups = groups;
  }

  public Integer getTeams() {
    return teams;
  }

  public void setTeams(Integer teams) {
    this.teams = teams;
  }

  public NowLeague getLeague() {
    return league;
  }

  public void setLeague(NowLeague league) {
    this.league = league;
  }

  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }

  public List<Disable> getDisable() {
    return disable;
  }

  public void setDisable(List<Disable> disable) {
    this.disable = disable;
  }  
  
}
