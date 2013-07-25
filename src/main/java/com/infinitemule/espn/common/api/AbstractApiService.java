/**
 * Spring ESPN 
 */
package com.infinitemule.espn.common.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * 
 */
public abstract class AbstractApiService implements ApiService {
  
  @Value("${espn.api-key}")
  private String apiKey;  
  
  @Value("${espn.accept}")
  private String accept = Output.JSON.getType();
  
  @Value("${espn.lang}")
  private String lang = Language.English.getAbbr();

  @Autowired
  private ObjectMapper mapper = null;
  

  /**
   * 
   */  
  public UrlBuilder createUrl() {    
    return UrlBuilder.create().accept(accept).apiKey(apiKey);   
  }
 
  
  /**
   * 
   */  
  public UrlBuilder createUrl(String path) {    
    return UrlBuilder.create(path).accept(accept).apiKey(apiKey);   
  }

  
  /**
   * 
   */  
  public UrlBuilder createUrl(String path, Language language) {        
    return UrlBuilder.create(path)
        .language(language)
        .accept(accept)
        .apiKey(apiKey);   
  }


  /**
   * 
   */
  protected <T> T readJson(String json, Class<T> responseType) {
    
    T obj = null;
    
    try {
      obj = mapper.readValue(json, responseType);
    }
    catch(IOException e) {
      throw new ApiParserException(e);
    }
    
    return obj;
    
  }  
  
  /*
   * 
   */
  
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public void setAccept(String accept) {
    this.accept = accept;
  }


  public void setLang(String lang) {
    this.lang = lang;
  }
    
}
