/*
 * 
 */
package com.infinitemule.espn.common.api;

import static com.infinitemule.espn.common.lang.Booleans.not;
import static org.apache.commons.collections.CollectionUtils.isEmpty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.infinitemule.espn.common.api.ApiUrls.Common;

/**
 * 
 */
public abstract class ApiRequest {

  private static final Integer DEFAULT_LIMIT  = 10;
  private static final Integer DEFAULT_OFFSET = 0;


  private Integer limit  = DEFAULT_LIMIT;
  private Integer offset = DEFAULT_OFFSET;
  private Region  region;
  
  private String method;
  
  private Language language = Language.English;
  private Output   accept   = Output.JSON; 

  
  public Map<String, String> getQueryParams() { 
    return new HashMap<String, String>();    
  };
  
  
  public Map<String, String> getUrlParams() { 
    return new HashMap<String, String>(); 
  };
    
  
  protected <T> Boolean isSpecified(List<T> list) {
    
    if(list == null) {
      return false;
    }
    
    if(isEmpty(list)) {
      return false;
    }
    
    return true;
  }
  
  protected Boolean isSpecified(Object obj) {
    if(obj != null) {
      return true;
    }
    
    return false;
  }
  
  protected Map<String, String> createPageableParams() {
    
    Map<String, String> queryParams = Maps.newHashMap();

    if(not(DEFAULT_LIMIT.equals(getLimit()))) {
      queryParams.put(Common.Params.limit, limit.toString());
    }
    
    if(not(DEFAULT_OFFSET.equals(getOffset()))) {
      queryParams.put(Common.Params.offset, offset.toString());
    }
    
    return queryParams;
  }
  
    
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public Output getAccept() {
    return accept;
  }

  public void setAccept(Output accept) {
    this.accept = accept;
  }
    
     
  public Integer getOffset() {
    return offset;
  }
  
  public void setOffset(Integer offset) {
    this.offset = offset;
  }
  
  public Integer getLimit() {
    return limit;
  }
  
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
      
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Region getRegion() {
    return region;
  }

  public void setRegion(Region region) {
    this.region = region;
  }
       
}
