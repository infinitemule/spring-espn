/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports;



/**
 * This is what's known as the "helper" API in the documentation,
 * but since they only return information about sports, I thought
 * sports was a better name.
 * 
 * http://developer.espn.com/overview#helper-api-calls
 */
public interface SportsApiService {
  
  public SportsApiResponse call(SportsApiRequest request);
  
}
