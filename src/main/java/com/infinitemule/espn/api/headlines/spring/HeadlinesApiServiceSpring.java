package com.infinitemule.espn.api.headlines.spring;

import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.headlines.HeadlinesApiRequest;
import com.infinitemule.espn.api.headlines.HeadlinesApiResponse;
import com.infinitemule.espn.api.headlines.HeadlinesApiService;
import com.infinitemule.espn.common.api.ApiServiceSpring;
import com.infinitemule.espn.common.api.City;


/**
 * 
 */
@Component
public class HeadlinesApiServiceSpring extends    ApiServiceSpring 
                                       implements HeadlinesApiService {
  
  
  public HeadlinesApiResponse newsForAllCities() {
    return request(new HeadlinesApiRequest().news().forAllCities());
  }
  
  public HeadlinesApiResponse headlinesForAllCities() {
    return request(new HeadlinesApiRequest().headlines().forAllCities());
  }

  public HeadlinesApiResponse topHeadlinesForAllCities() {
    return request(new HeadlinesApiRequest().topHeadlines().forAllCities());
  }

 
  public HeadlinesApiResponse newsForCity(City city) {
    return request(new HeadlinesApiRequest().news().forCity(city));
  }

  public HeadlinesApiResponse headlinesForCity(City city) {
    return request(new HeadlinesApiRequest().headlines().forCity(city));
  }

  public HeadlinesApiResponse topHeadlinesForCity(City city) {
    return request(new HeadlinesApiRequest().topHeadlines().forCity(city));
  }

  
  
  public HeadlinesApiResponse request(HeadlinesApiRequest request) {
    
    String url = 
        createUrl(request.getMethod())
                  .urlParams(request.getUrlParams())
                  .queryParams(request.getQueryParams())
                  .toString();
    
   return callService(url, HeadlinesApiResponse.class);
    
  }
  
}
