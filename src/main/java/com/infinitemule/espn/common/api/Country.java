/*
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;

public class Country {

  private Integer id;
  private String  name;
  private String  abbreviation;
  
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
    
}
