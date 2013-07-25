/**
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;

/**
 * 
 */
public class ApiException extends RuntimeException {


  public ApiException(String msg) {
    super(msg);
  }

  
  public ApiException(String msg, Throwable t) {
    super(msg, t);
  }

  
  private static final long serialVersionUID = -1905321967978422895L;

}
