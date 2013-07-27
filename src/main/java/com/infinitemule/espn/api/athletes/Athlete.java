/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.athletes;

/**
 * 
 */
public class Athlete {

  private Integer id;
  private String  firstName;
  private String  lastName;
  private String  fullName;
  private String  displayName;
  private String  shortName;
  
  private AthleteLinks links;
  
  
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public AthleteLinks getLinks() {
    return links;
  }

  public void setLinks(AthleteLinks links) {
    this.links = links;
  }
  
}
