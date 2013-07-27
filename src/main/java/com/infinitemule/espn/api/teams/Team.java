/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.teams;

import java.util.List;

/**
 * 
 */
public class Team {

  private Integer id;
  private String  uid;
  private String  location;
  private String  name;
  private String  nickname;
  private String  abbreviation;
  private String  color;
  
  private TeamLinks links;
  
  private List<Venue> venues;
  
  
  public Team() {
    
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
    
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public TeamLinks getLinks() {
    return links;
  }

  public void setLinks(TeamLinks links) {
    this.links = links;
  }

  public List<Venue> getVenues() {
    return venues;
  }

  public void setVenues(List<Venue> venues) {
    this.venues = venues;
  }
    
}
