/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.sports.SportsApiRequest;
import com.infinitemule.espn.api.sports.SportsApiResponse;
import com.infinitemule.espn.api.sports.SportsApiService;
import com.infinitemule.espn.common.api.ApiService;


/**
 * 
 */
@Component
public class SportsApiServiceSpring  implements SportsApiService {

  
  @Autowired
  private ApiService service;
  
  
  /**
   * 
   */ 
  public SportsApiResponse call(SportsApiRequest request) {        
    return service.call(request, SportsApiResponse.class);
  }

}
