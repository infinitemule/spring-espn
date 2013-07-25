/**
 * 
 */
package com.infinitemule.espn.common.api;

/**
 * 
 */
public class ApiParserException extends ApiException {

  public ApiParserException(Throwable t) {
    super("Error parsing response: " + t.getMessage(), t);
  }

  
  private static final long serialVersionUID = -852723117826055774L;
  
}
