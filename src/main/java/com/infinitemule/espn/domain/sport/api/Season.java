/**
 * Spring ESPN
 */
package com.infinitemule.espn.domain.sport.api;

import java.util.List;

/**
 * 
 */
public class Season {

  private Integer year;
  private Integer type;
  private String  description;
  
  private String  startDate;
  private String  endDate;

  // Optional
  private Integer seasonTypeId;
  private List<SeasonType> seasonTypes;
  
  public Season() {
    
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Integer getSeasonTypeId() {
    return seasonTypeId;
  }

  public void setSeasonTypeId(Integer seasonTypeId) {
    this.seasonTypeId = seasonTypeId;
  }

  public List<SeasonType> getSeasonTypes() {
    return seasonTypes;
  }

  public void setSeasonTypes(List<SeasonType> seasonTypes) {
    this.seasonTypes = seasonTypes;
  }
      
}
