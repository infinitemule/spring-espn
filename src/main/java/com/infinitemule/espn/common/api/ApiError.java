/**
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;

/**
 * 
 *
 */
public class ApiError {

  private String  status;
  private Integer code;
  private String  message;
  private String  timestamp = null;
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public Integer getCode() {
    return code;
  }
  
  public void setCode(Integer code) {
    this.code = code;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  public String getTimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }
   
}
