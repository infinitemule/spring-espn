/**
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;


import static com.infinitemule.espn.common.lang.Booleans.not;
import static org.apache.commons.collections.CollectionUtils.isEmpty;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.common.collect.Maps;
import com.infinitemule.espn.common.api.ApiUrls.Common;



/**
 * 
 */
@Component
public abstract class ApiServiceSpring extends AbstractApiService implements ApiService {

  
  private static final Integer DEFAULT_LIMIT  = 10;
  private static final Integer DEFAULT_OFFSET = 0;

  
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

  protected Map<String, String> createPageableParams(Integer limit, Integer offset) {
    
    Map<String, String> queryParams = Maps.newHashMap();

    if(not(DEFAULT_LIMIT.equals(limit))) {
      queryParams.put(Common.Params.limit, limit.toString());
    }
    
    if(not(DEFAULT_OFFSET.equals(offset))) {
      queryParams.put(Common.Params.offset, offset.toString());
    }
    
    return queryParams;
  }

  
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

  
  private Boolean isOk(ResponseEntity<String> entity) {
    return entity.getStatusCode().value() == HttpStatus.OK.value();
  }
  
  
  
}

