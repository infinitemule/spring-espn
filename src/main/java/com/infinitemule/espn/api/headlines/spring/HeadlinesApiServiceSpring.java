/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.headlines.spring;

import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.headlines.HeadlinesApiRequest;
import com.infinitemule.espn.api.headlines.HeadlinesApiResponse;
import com.infinitemule.espn.api.headlines.HeadlinesApiService;

import com.infinitemule.espn.common.api.City;
import com.infinitemule.espn.common.api.EspnApiServiceSpring;


/**
 * 
 */
@Component
public class HeadlinesApiServiceSpring extends    EspnApiServiceSpring 
                                       implements HeadlinesApiService {

 
  public HeadlinesApiResponse newsForCity(City city) {
    return call(new HeadlinesApiRequest().news().forCity(city));
  }

  public HeadlinesApiResponse headlinesForCity(City city) {
    return call(new HeadlinesApiRequest().headlines().forCity(city));
  }


  
  @Override
  public HeadlinesApiResponse call(HeadlinesApiRequest request) {        
   return call(request, HeadlinesApiResponse.class);    
  }
  
}
