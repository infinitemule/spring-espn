/**
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



/**
 * 
 */
public abstract class EspnApiServiceSpring extends EspnApiService implements ApiService {

  
  @Autowired
  private RestTemplate restTemplate = null;  
  
  
  public EspnApiServiceSpring() {
           
  }
  
  /**
   * 
   */
  @Override
  public <T extends ApiResponse> T call(ApiRequest request, Class<T> responseType) {
    
    String url = 
        createUrl(request.getMethod())
                  .urlParams(request.getUrlParams())
                  .queryParams(request.getQueryParams())
                  .toString();
    
    return call(url, responseType);
  }
  
  
  /**
   * 
   */
  @Override
  public <T extends ApiResponse> T call(String url, Class<T> responseType) {
  
    ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
          
    if(isOk(entity)) {
      return readJson(entity.getBody(), responseType);
    }
    
    throw new ApiErrorException(readJson(entity.getBody(), ApiError.class));
                    
  }


  
  private Boolean isOk(ResponseEntity<String> entity) {
    return entity.getStatusCode().value() == HttpStatus.OK.value();
  }
      
}

