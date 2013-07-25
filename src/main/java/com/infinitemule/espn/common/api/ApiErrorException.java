/**
 * 
 */
package com.infinitemule.espn.common.api;


/**
 * 
 */
public class ApiErrorException extends ApiException {

  private ApiError error;
  
  public ApiErrorException(ApiError error) {
    super("API responed with an error: " + error.getMessage());
    setError(error);     
  }

  public ApiError getError() {
    return error;
  }

  public void setError(ApiError error) {
    this.error = error;
  }

  
  private static final long serialVersionUID = -7370227296276695346L;
  
}
