/**
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;


/**
 * 
 */
public interface ApiService {

  public UrlBuilder createUrl();
  public UrlBuilder createUrl(String path);
   
  public <T extends ApiResponse> T callService(String url, Class<T> responseType);     
        
}
