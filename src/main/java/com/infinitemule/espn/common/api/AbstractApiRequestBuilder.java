/*
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;

public class AbstractApiRequestBuilder {

  private static final Integer DEFAULT_LIMIT  = 10;
  private static final Integer DEFAULT_OFFSET = 0;
  
  private String method;
  
  private Language lang;
  private Integer  offset;
  private Integer  limit;
  private Region   region;
  
  
  protected AbstractApiRequestBuilder() {
    setLimit(DEFAULT_LIMIT);
    setOffset(DEFAULT_OFFSET);
  }
  
  public Language getLang() {
    return lang;
  }
  
  public void setLang(Language lang) {
    this.lang = lang;
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
