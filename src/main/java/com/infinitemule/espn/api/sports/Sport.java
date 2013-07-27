/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;


/**
 * 
 */
public class Sport {

  private Integer id;
  private String  name;
  private String  uid;

  private SportsLinks links;

  private List<League> leagues = newArrayList();
  
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

  public SportsLinks getLinks() {
    return links;
  }

  public void setLinks(SportsLinks links) {
    this.links = links;
  }

  public List<League> getLeagues() {
    return leagues;
  }

  public void setLeagues(List<League> leagues) {
    this.leagues = leagues;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }    
  
}
