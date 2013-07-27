/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.headlines;

public class HeadlineRelated {

  private Integer id;
  private String  title;
  
  private HeadlineLinks links;
  
  public HeadlineRelated() {
    
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public HeadlineLinks getLinks() {
    return links;
  }

  public void setLinks(HeadlineLinks links) {
    this.links = links;
  }
    
}
