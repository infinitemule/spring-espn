/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports.spring;

import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.sports.SportsApiRequest;
import com.infinitemule.espn.api.sports.SportsApiResponse;
import com.infinitemule.espn.api.sports.SportsApiService;
import com.infinitemule.espn.common.api.EspnApiServiceSpring;


/**
 * 
 */
@Component
public class SportsApiServiceSpring extends    EspnApiServiceSpring  
                                    implements SportsApiService {

    
  /**
   * 
   */ 
  public SportsApiResponse call(SportsApiRequest request) {        
    return call(request, SportsApiResponse.class);
  }

}
