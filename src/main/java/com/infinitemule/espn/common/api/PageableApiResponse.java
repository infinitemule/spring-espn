/*
 * 
 */
package com.infinitemule.espn.common.api;

/**
 *
 */
public abstract class PageableApiResponse extends ApiResponse {

  private Integer resultsOffset;
  private Integer resultsLimit;
  private Integer resultsCount;
  
  public Integer getResultsOffset() {
    return resultsOffset;
  }

  public void setResultsOffset(Integer resultsOffset) {
    this.resultsOffset = resultsOffset;
  }

  public Integer getResultsLimit() {
    return resultsLimit;
  }

  public void setResultsLimit(Integer resultsLimit) {
    this.resultsLimit = resultsLimit;
  }

  public Integer getResultsCount() {
    return resultsCount;
  }

  public void setResultsCount(Integer resultsCount) {
    this.resultsCount = resultsCount;
  }

}
