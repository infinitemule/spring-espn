/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.now.spring;


import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.now.NowApiRequest;
import com.infinitemule.espn.api.now.NowApiResponse;
import com.infinitemule.espn.api.now.NowApiService;
import com.infinitemule.espn.common.api.EspnApiServiceSpring;

/**
 * 
 */
@Component
public class NowApiServiceSpring extends    EspnApiServiceSpring 
                                 implements NowApiService {    
  
  @Override
  public NowApiResponse call(NowApiRequest request) {        
    return call(request, NowApiResponse.class);
  }
      
}
