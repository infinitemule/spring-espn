package com.infinitemule.espn.common.api;

import java.io.IOException;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * 
 */
public class ApiResponseErrorHandler implements ResponseErrorHandler {

  /**
   * TODO: Figure out why we did it this way
   */
  public boolean hasError(ClientHttpResponse response) throws IOException {
    return false;
  }

  
  /**
   * Called when hasError returns true.  Since we are always returning false,
   * we do not need to provide an implementation.
   */
  public void handleError(ClientHttpResponse response) throws IOException {

  }

}
