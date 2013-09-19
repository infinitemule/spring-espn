/*
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */
public class UrlBuilderTest {

  private static final String API_KEY = "APIKEY123";
  
  @Test(expected=ApiUrlException.class)
  public void noApiKey() {
    
    UrlBuilder.create("/test").toString();
        
  }
  
  
  @Test
  public void pathOnly() {
    
    String url = null;
    
    url = UrlBuilder.create("/test").apiKey(API_KEY).toString();
    
    assertEquals(format("http://api.espn.com/v1/test?apiKey=%s", API_KEY), 
                 url);
    
    url = UrlBuilder.create().path("/test").apiKey(API_KEY).toString();

    assertEquals(format("http://api.espn.com/v1/test?apiKey=%s", API_KEY), 
                 url);

  }
  
  
  @Test
  public void pathAndLanguage() {
    
    String url = null;
    
    url = UrlBuilder.create("/test")
              .language(Language.Spanish)
              .apiKey(API_KEY).toString();
    
    assertEquals(format("http://api.espn.com/v1/test?lang=es&apiKey=%s", API_KEY), 
                 url);

    url = UrlBuilder.create("/test")
              .language(Language.English)
              .apiKey(API_KEY).toString();

    assertEquals(format("http://api.espn.com/v1/test?apiKey=%s", API_KEY), 
                 url);

  }
  
  
  @Test
  public void urlParam() {
    String url = null;
    
    url = UrlBuilder.create("/test/{urlParam}")
              .urlParam("urlParam", "123456")
              .apiKey(API_KEY).toString();
    
    assertEquals(format("http://api.espn.com/v1/test/123456?apiKey=%s", API_KEY), 
                 url);
    
  }
  
    
  @Test
  public void urlParams() {
    
    Map<String, String> urlParams = new HashMap<String, String>();
    
    urlParams.put("urlParamA", "alpha");
    urlParams.put("urlParamB", "beta");
    
    String url = null;
    
    url = UrlBuilder.create("/test/{urlParamA}/{urlParamB}/123")
              .urlParams(urlParams)
              .apiKey(API_KEY).toString();
    
    assertEquals(format("http://api.espn.com/v1/test/alpha/beta/123?apiKey=%s", API_KEY), 
                 url);
    
  }

  
  @Test
  public void queryParam() {
    String url = null;
    
    url = UrlBuilder.create("/test")
              .queryParam("queryParam", "123456")
              .apiKey(API_KEY).toString();
    
    assertEquals(format("http://api.espn.com/v1/test?queryParam=123456&apiKey=%s", API_KEY), 
                 url);
    
  }

  
  @Test
  public void queryParams() {
    
    Map<String, String> queryParams = new HashMap<String, String>();
    
    queryParams.put("queryParamA", "alpha");
    queryParams.put("queryParamB", "beta");
    
    String url = null;
    
    url = UrlBuilder.create("/test")
              .queryParams(queryParams)
              .apiKey(API_KEY).toString();
    
    assertEquals(
        format("http://api.espn.com/v1/test?queryParamA=alpha&queryParamB=beta&apiKey=%s", API_KEY), 
        url);
    
  }  
  
}
