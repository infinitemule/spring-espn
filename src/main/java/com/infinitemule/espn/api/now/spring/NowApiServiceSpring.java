/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.now.spring;


import java.util.Map;

import org.springframework.stereotype.Component;

import com.google.common.collect.Maps;
import com.infinitemule.espn.api.now.NowApiRequest;
import com.infinitemule.espn.api.now.NowApiResponse;
import com.infinitemule.espn.api.now.NowApiService;
import com.infinitemule.espn.common.api.ApiServiceSpring;

import com.infinitemule.espn.common.api.ApiUrls.Common;
import com.infinitemule.espn.common.api.ApiUrls.Now;

/**
 * 
 */
@Component
public class NowApiServiceSpring extends    ApiServiceSpring
                                 implements NowApiService {

    
  public NowApiResponse latest() {
    return latest(10, 0);    
  }
  

  public NowApiResponse latest(Integer limit) {    
    return latest(limit, 0);   
  }
  
  public NowApiResponse latest(Integer limit, Integer offset) {
    
    return request(
      new NowApiRequest()
          .now().limit(limit).offset(offset));

  }

  
  
  public NowApiResponse top() {
    return top(10, 0);    
  }
  

  public NowApiResponse top(Integer limit) {    
    return top(limit, 0);    
  }

  
  public NowApiResponse top(Integer limit, Integer offset) {
    
    return request(
        new NowApiRequest()
            .top().limit(limit).offset(offset));

  }

  public NowApiResponse popular() {
    return popular(10, 0);    
  }
  

  public NowApiResponse popular(Integer limit) {    
    return popular(limit, 0);    
  }

  
  public NowApiResponse popular(Integer limit, Integer offset) {

    return request(
        new NowApiRequest()
            .popular().limit(limit).offset(offset));

  }
  
  public NowApiResponse request(NowApiRequest request) {
    
    String url = 
        createUrl(request.getMethod())
                  .queryParams(createQueryParams(request))
                  .toString();
    
    return callService(url, NowApiResponse.class);
  }
  
  
  
  private Map<String, String> createQueryParams(NowApiRequest request) {
    
    Map<String, String> queryParams = Maps.newHashMap();
    
    if(isSpecified(request.getLeague())) {
      queryParams.put(Now.Params.leagues, request.getLeague().getId());
    }
    
    if(isSpecified(request.getGroups())) {
      queryParams.put(Now.Params.groups, request.getGroups().toString());
    }
    
    if(isSpecified(request.getTeams())) {
      queryParams.put(Now.Params.teams, request.getTeams().toString());
    }

    if(isSpecified(request.getContent())) {
      queryParams.put(Now.Params.content, request.getContent().getId());
    }

    if(isSpecified(request.getDisable())) {
      queryParams.put(Now.Params.disable, request.getDisableList());
    }
    
    if(isSpecified(request.getLang())) {
      queryParams.put(Common.Params.lang, request.getLang().getAbbr());
    }
    
    if(isSpecified(request.getRegion())) {
      queryParams.put(Now.Params.region, request.getRegion().getId());
    }
    
    queryParams.putAll(createPageableParams(request.getLimit(), request.getOffset()));
    
    return queryParams;
  }
}
