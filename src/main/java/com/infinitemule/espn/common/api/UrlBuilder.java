/*
 * 
 */
package com.infinitemule.espn.common.api;


import static com.infinitemule.espn.common.lang.Booleans.not;
import static org.apache.commons.lang3.StringUtils.isEmpty;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.util.UriComponentsBuilder;


/**
 * 
 */
public class UrlBuilder {

  private final Logger log = LoggerFactory.getLogger(getClass());

  private UriComponentsBuilder builder;
  private Map<String, String> urlParams = new HashMap<String, String>();
  
  private String apiKey;
  private String language = Language.English.getAbbr();
  private String accept = Output.JSON.getType();
  
  
  public static UrlBuilder create() {
    return new UrlBuilder();    
  }
  
  public static UrlBuilder create(String path) {
    return new UrlBuilder(path);
  }
  
  
  public UrlBuilder() {
    
    builder = UriComponentsBuilder.newInstance()
        .scheme(ApiUrls.scheme)
        .host(ApiUrls.host)
        .path(ApiUrls.version);    
  }

  
  public UrlBuilder(String path) {    
    this();
    path(path);    
  }

  
  public UrlBuilder path(String path) {
    builder.path(path);
    return this;
  }
    
  public UrlBuilder urlParam(String name, String value) {
    urlParams.put(name, value);
    return this;
  }
  
  public UrlBuilder urlParams(Map<String, String> urlParams) {
    this.urlParams = urlParams;
    return this;
  }
  
  public UrlBuilder queryParam(String name, String value) {
    builder.queryParam(name, value);
    return this;
  }
  
  public UrlBuilder queryParam(String name, Integer value) {
    builder.queryParam(name, value.toString());
    return this;
  }
  
  public UrlBuilder queryParams(Map<String, String> queryParams) {
    
    for(Entry<String, String> entry : queryParams.entrySet()) {
      queryParam(entry.getKey(), entry.getValue());
    }
    
    return this;
  }


  public UrlBuilder accept(String accept) {
    this.accept = accept;
    return this;
  }

  
  public UrlBuilder apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }
  
  public UrlBuilder language(Language language) {
    this.language = language.getAbbr();
    return this;
  }
  
  
  @Override
  public String toString() {
    
    if(isEmpty(apiKey)) {
      throw new ApiUrlException("API key must be specified.");
    }
    
    // EN is the default, so we don't need to specify it.
    if(not(language.equals(Language.English.getAbbr()))) {
      queryParam("lang", language);  
    }    
    
    // JSON is the default so we don't need to specify it.
    if(not(accept.equals(Output.JSON.getType()))) {
      queryParam("_accept", accept);
    }
    
    queryParam("apiKey", apiKey);
    
    String url = builder.build().expand(urlParams).encode().toUri().toString();
    
    log.debug("URL: " + url);
    
    return url;
  }
}
