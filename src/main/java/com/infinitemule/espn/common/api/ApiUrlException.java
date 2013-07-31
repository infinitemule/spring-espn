/*
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;

public class ApiUrlException extends RuntimeException {

  private static final long serialVersionUID = -4477898534879036086L;

  public ApiUrlException() {
    super();
  }

  public ApiUrlException(String msg) {
    super(msg);
  }

  public ApiUrlException(String msg, Throwable cause) {
    super(msg, cause);
  }
  
}
