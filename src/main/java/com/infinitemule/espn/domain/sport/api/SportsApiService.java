/**
 * Spring ESPN
 */
package com.infinitemule.espn.domain.sport.api;

import java.util.List;


/**
 * 
 */
public interface SportsApiService {

  /*
   * Sports
   */
  
  public SportsApiResponse getAllSports();
  
  public SportApiResponse getSport(String name);
  public SportApiResponse getSport(String name, String league);
  
  /*
   * Teams
   */
  
  public TeamsApiResponse getTeams(TeamsApiRequest request);
  
  public TeamsApiResponse getTeams(String sport, String league);
  
  public TeamsApiResponse getTeams(String sport, String league, 
                                   Integer group);
  
  public TeamsApiResponse getTeams(String sport, String league, 
                                   List<TeamOption> options);
  
  public TeamsApiResponse getTeams(String sport, String league, 
                                   Integer group, List<TeamOption> options);
}
