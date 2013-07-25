/*
 * 
 */
package com.infinitemule.espn.common.api;

/**
 * 
 */
public abstract class PageableApiRequest extends ApiRequest {

  private Integer limit  = null;
  private Integer offset = null;
  
  public PageableApiRequest() {
    
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }
    
}
