package com.infinitemule.espn.api.now;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Joiner;
import com.infinitemule.espn.common.api.AbstractApiRequestBuilder;
import com.infinitemule.espn.common.api.ApiUrls;
import com.infinitemule.espn.common.api.Content;
import com.infinitemule.espn.common.api.Language;
import com.infinitemule.espn.common.api.League;
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
public class NowApiRequest extends AbstractApiRequestBuilder {

  public static class Disable {
    
    public static final Disable BreakingNews = new Disable("breakingnews");
    public static final Disable Metrics      = new Disable("metrics");
    public static final Disable Categories   = new Disable("categories");
    
    private String id;
    private Disable(String id) { this.id = id; }
    public  String getId()     { return id; }
    
  }
  
  
  private League        league;
  private Content       content;
  private List<Disable> disable = new ArrayList<Disable>();

  private Integer teams;  
  private Integer groups;
  
  
  
  public NowApiRequest() {
    super();
  }

  public NowApiRequest now() {
    setMethod(ApiUrls.Now.now);
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

  
  public NowApiRequest league(League league) {
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
  
  public NowApiRequest lang(Language language) {
    setLang(language);
    return this;
  }
  
  
  public String getDisableList() {
    
    List<String> ids = new ArrayList<String>();
    
    for(Disable d: disable) {
      ids.add(d.getId());
    }
    
    return Joiner.on(",").join(ids);
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

  public League getLeague() {
    return league;
  }

  public void setLeague(League league) {
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
