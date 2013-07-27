package com.infinitemule.espn.common.api;

import java.util.Map;

public interface ApiRequest {

  public String getMethod();
  public Map<String, String> getUrlParams();
  public Map<String, String> getQueryParams();
  
}
