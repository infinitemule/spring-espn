/*
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;

public class Tracking {

  private String sportName;
  private String leagueName;
  private String coverageType;
  private String trackingName;
   
  public String getSportName() {
    return sportName;
  }
  
  public void setSportName(String sportName) {
    this.sportName = sportName;
  }
  
  public String getLeagueName() {
    return leagueName;
  }
  
  public void setLeagueName(String leagueName) {
    this.leagueName = leagueName;
  }
  
  public String getCoverageType() {
    return coverageType;
  }
  
  public void setCoverageType(String coverageType) {
    this.coverageType = coverageType;
  }
  
  public String getTrackingName() {
    return trackingName;
  }
  
  public void setTrackingName(String trackingName) {
    this.trackingName = trackingName;
  }  
  

}
