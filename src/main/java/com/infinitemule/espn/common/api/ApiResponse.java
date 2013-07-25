/**
 * 
 */
package com.infinitemule.espn.common.api;


/**
 * 
 */
public abstract class ApiResponse {

  private String timestamp;
  private String status;
  
  public String getTimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }  
    
    
}