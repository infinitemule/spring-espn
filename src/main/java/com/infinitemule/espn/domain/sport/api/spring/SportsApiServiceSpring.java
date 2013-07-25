/**
 * Spring ESPN
 */
package com.infinitemule.espn.domain.sport.api.spring;

import static com.infinitemule.espn.common.lang.Numbers.isPresent;
import static org.apache.commons.collections.CollectionUtils.isNotEmpty;

import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Component;


import com.google.common.base.Function;
import com.google.common.base.Joiner;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.infinitemule.espn.common.api.ApiServiceSpring;
import com.infinitemule.espn.common.api.ApiUrls;

import com.infinitemule.espn.domain.sport.api.SportApiResponse;
import com.infinitemule.espn.domain.sport.api.SportsApiResponse;
import com.infinitemule.espn.domain.sport.api.SportsApiService;
import com.infinitemule.espn.domain.sport.api.TeamOption;
import com.infinitemule.espn.domain.sport.api.TeamsApiRequest;
import com.infinitemule.espn.domain.sport.api.TeamsApiResponse;


/**
 * 
 */
@Component
public class SportsApiServiceSpring extends    ApiServiceSpring 
                                    implements SportsApiService {

  
  /**
   * 
   */
  public SportsApiResponse getAllSports() {    
    return callService(createUrl(ApiUrls.Sports.all).toString(), 
                       SportsApiResponse.class); 
  }
  
  
  /**
   * 
   */
  public SportApiResponse getSport(String name) {
    
    String url = createUrl(ApiUrls.Sports.byName)
        .urlParam("sport", name)        
        .toString();
    
    return callService(url, SportApiResponse.class);
  }

  
  /**
   * 
   */
  public SportApiResponse getSport(String name, String league) {
        
    String url = createUrl(ApiUrls.Sports.byNameAndLeague)
      .urlParam("sport",  name)
      .urlParam("league", league)
      .toString();
    
    return callService(url, SportApiResponse.class);
  }
  

  /**
   * 
   */
  public TeamsApiResponse getTeams(TeamsApiRequest request) {
   
    String url = createUrl(ApiUrls.Teams.bySportAndLeague)
        .urlParam("sport",  request.getSport())
        .urlParam("league", request.getLeague())
        .queryParams(createTeamQueryParams(request))
        .toString();
    
    
    return callService(url, TeamsApiResponse.class);  
  }  
  
  /**
   * 
   */
  public TeamsApiResponse getTeams(String sport, String league) {       
    return getTeams(new TeamsApiRequest(sport, league));
  }
  

  /**
   * 
   */
  public TeamsApiResponse getTeams(String sport, 
                                   String league,
                                   List<TeamOption> options) {

    return getTeams(new TeamsApiRequest(sport, league, options));

  }
  
  /**
   * 
   */
  public TeamsApiResponse getTeams(String  sport, 
                                   String  league,
                                   Integer group) {
    
    return getTeams(new TeamsApiRequest(sport, league, group, null)); 

  }
  
  
  /**
   * 
   */
  public TeamsApiResponse getTeams(String  sport, 
                                   String  league,
                                   Integer group,
                                   List<TeamOption> options) {
    
    return getTeams(new TeamsApiRequest(sport, league, group, options)); 

  }
    
  

  /**
   * 
   */
  private Map<String, String> createTeamQueryParams(TeamsApiRequest request) {
     
    Map<String, String> queryParams = Maps.newHashMap();
    
    if(isNotEmpty(request.getOptions())) {

      List<String> teamOptions = Lists.transform(request.getOptions(), 
          new Function<TeamOption, String>() {
            public String apply(TeamOption option) {
              return option.getName();
          };
      });
        
      queryParams.put("enable", Joiner.on(",").join(teamOptions));
    }
    
    if(isPresent(request.getGroup())) {
      queryParams.put("group", request.getGroup().toString());
    }
        
    return queryParams;
  }  
}
