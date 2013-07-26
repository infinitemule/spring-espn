package com.infinitemule.espn.common.api;

public class Category {

  private Integer id;
  private String  description;
  
  private CategoryLinksGroup links;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CategoryLinksGroup getLinks() {
    return links;
  }

  public void setLinks(CategoryLinksGroup links) {
    this.links = links;
  }
  
   
}
