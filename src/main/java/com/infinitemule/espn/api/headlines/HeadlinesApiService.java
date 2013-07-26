package com.infinitemule.espn.api.headlines;

import com.infinitemule.espn.common.api.City;

public interface HeadlinesApiService {

  
  public HeadlinesApiResponse newsForAllCities();
  public HeadlinesApiResponse headlinesForAllCities();
  public HeadlinesApiResponse topHeadlinesForAllCities();

  public HeadlinesApiResponse newsForCity(City city);
  public HeadlinesApiResponse headlinesForCity(City city);
  public HeadlinesApiResponse topHeadlinesForCity(City city);


  public HeadlinesApiResponse request(HeadlinesApiRequest request); 
  
}
