/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.headlines.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.headlines.HeadlinesApiRequest;
import com.infinitemule.espn.api.headlines.HeadlinesApiResponse;
import com.infinitemule.espn.api.headlines.HeadlinesApiService;
import com.infinitemule.espn.common.api.ApiService;
import com.infinitemule.espn.common.api.City;


/**
 * 
 */
@Component
public class HeadlinesApiServiceSpring implements HeadlinesApiService {
  
  @Autowired
  private ApiService service;
  
  public HeadlinesApiResponse newsForAllCities() {
    return call(new HeadlinesApiRequest().news().forCities());
  }
  
  public HeadlinesApiResponse headlinesForAllCities() {
    return call(new HeadlinesApiRequest().headlines().forCities());
  }

  public HeadlinesApiResponse topHeadlinesForAllCities() {
    return call(new HeadlinesApiRequest().topHeadlines().forCities());
  }

 
  public HeadlinesApiResponse newsForCity(City city) {
    return call(new HeadlinesApiRequest().news().forCity(city));
  }

  public HeadlinesApiResponse headlinesForCity(City city) {
    return call(new HeadlinesApiRequest().headlines().forCity(city));
  }

  public HeadlinesApiResponse topHeadlinesForCity(City city) {
    return call(new HeadlinesApiRequest().topHeadlines().forCity(city));
  }

  
  @Override
  public HeadlinesApiResponse call(HeadlinesApiRequest request) {        
   return service.call(request, HeadlinesApiResponse.class);    
  }
  
}
