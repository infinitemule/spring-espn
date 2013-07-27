/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports;

public class SeasonType {

  private Integer id;
  private String  name;
  private String  abbreviation;
  
  private String startDate;
  private String endDate;
  
  private Boolean hasGroups;
  private Boolean hasStandings;
  
  public SeasonType() {
    
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
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

  public Boolean getHasGroups() {
    return hasGroups;
  }

  public void setHasGroups(Boolean hasGroups) {
    this.hasGroups = hasGroups;
  }

  public Boolean getHasStandings() {
    return hasStandings;
  }

  public void setHasStandings(Boolean hasStandings) {
    this.hasStandings = hasStandings;
  }
    
}
