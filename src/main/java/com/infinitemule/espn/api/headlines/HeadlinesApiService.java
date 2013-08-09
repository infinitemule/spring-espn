/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.headlines;

import com.infinitemule.espn.common.api.City;

public interface HeadlinesApiService {

  
  public HeadlinesApiResponse newsForAllCities();
  public HeadlinesApiResponse headlinesForAllCities();  

  public HeadlinesApiResponse newsForCity(City city);
  public HeadlinesApiResponse headlinesForCity(City city);  


  public HeadlinesApiResponse call(HeadlinesApiRequest request); 
  
}
