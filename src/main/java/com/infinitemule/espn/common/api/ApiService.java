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
   
  public <T extends ApiResponse> T call(ApiRequest request, Class<T> responseType);
  public <T extends ApiResponse> T call(String url, Class<T> responseType);     
        
}
