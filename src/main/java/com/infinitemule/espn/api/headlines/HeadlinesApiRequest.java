package com.infinitemule.espn.api.headlines;

import java.util.Map;

import com.infinitemule.espn.common.api.ApiRequest;
import com.infinitemule.espn.common.api.ApiUrls.Headlines;
import com.infinitemule.espn.common.api.City;
import com.infinitemule.espn.common.api.FantasySport;

public class HeadlinesApiRequest extends ApiRequest {

  private String type;
  
  private City city;
  private FantasySport fantasySport;
    
  private String dates;
  
  public HeadlinesApiRequest news() {        
    setType(Headlines.news);    
    return this;
  }
  
  public HeadlinesApiRequest headlines() {    
    setType(Headlines.headlines);    
    return this;
  }
  
  public HeadlinesApiRequest topHeadlines() {    
    setType(Headlines.topHeadlines);    
    return this;
  }
  

  
  public HeadlinesApiRequest forAllCities() {
    setMethod(Headlines.allCities + getType());
    return this;
  }
  
  public HeadlinesApiRequest forCity(City city) {
    setMethod(Headlines.byCity + getType());    
    return this;
  }

  
  
  public HeadlinesApiRequest forEspnW() {
    setMethod(Headlines.espnW + getType());
    return this;
  }
  
  public HeadlinesApiRequest forEspnMagazine() {
    setMethod(Headlines.espnMagazine + getType());
    return this;
  }
  
  
  public HeadlinesApiRequest forAllFantasySports() {
    setMethod(Headlines.allFantasy + getType());
    return this;
  }
  
  public HeadlinesApiRequest forFantasySport(FantasySport sport) {
    setMethod(Headlines.byFantasySport + getType());
    setFantasySport(sport);
    return this;
  }
  
  
  public HeadlinesApiRequest date(String date) {
    setDates(date.replaceAll("-", ""));
    return this;
  }
  
  
  @Override
  public Map<String, String> getUrlParams() {
    
    Map<String, String> urlParams = super.getUrlParams();        
    
    if(isSpecified(getCity())) {
      urlParams.put(Headlines.Params.city, getCity().getId());
    }
    
    if(isSpecified(getFantasySport())) {
      urlParams.put(Headlines.Params.sport, getFantasySport().getId());
    }
    
    return urlParams;
    
  }
  
  @Override
  public Map<String, String> getQueryParams() {
    
    Map<String, String> queryParams = super.getQueryParams();
    
    if(isSpecified(dates)) {
      queryParams.put(Headlines.Params.dates, dates);
    }
    
    queryParams.putAll(createPageableParams());
    
    return queryParams;
    
  }

  public String getType() {
    return type;
  }
    
  public void setType(String type) {
    this.type = type;  
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public FantasySport getFantasySport() {
    return fantasySport;
  }

  public void setFantasySport(FantasySport fantasySport) {
    this.fantasySport = fantasySport;
  }

  public String getDates() {
    return dates;
  }

  public void setDates(String dates) {
    this.dates = dates;
  }
        
}
