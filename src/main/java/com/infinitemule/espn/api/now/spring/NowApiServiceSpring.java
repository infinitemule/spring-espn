/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.now.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.now.NowApiRequest;
import com.infinitemule.espn.api.now.NowApiResponse;
import com.infinitemule.espn.api.now.NowApiService;
import com.infinitemule.espn.common.api.ApiService;

/**
 * 
 */
@Component
public class NowApiServiceSpring implements NowApiService {

  @Autowired
  private ApiService service;
    
  
  public NowApiResponse latest() {
    return latest(10, 0);    
  }
  

  public NowApiResponse latest(Integer limit) {    
    return latest(limit, 0);   
  }
  
  public NowApiResponse latest(Integer limit, Integer offset) {
    
    return call(
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
    
    return call(
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

    return call(
        new NowApiRequest()
            .popular().limit(limit).offset(offset));

  }
  
  @Override
  public NowApiResponse call(NowApiRequest request) {        
    return service.call(request, NowApiResponse.class);
  }
      
}
