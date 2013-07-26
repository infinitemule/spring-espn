/**
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



/**
 * 
 */
@Component
public abstract class ApiServiceSpring extends AbstractApiService implements ApiService {

  
  @Autowired
  private RestTemplate restTemplate = null;  
  
  
  public ApiServiceSpring() {
           
  }
  
  
  /**
   * 
   */
  public <T extends ApiResponse> T callService(String url, Class<T> responseType) {
  
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

