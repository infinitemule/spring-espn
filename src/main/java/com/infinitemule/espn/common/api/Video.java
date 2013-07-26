package com.infinitemule.espn.common.api;


public class Video {

  private Integer id;
  private String  title;
  private String  thumbnail;
  private String  description;
  
  private VideoLinks links;

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

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VideoLinks getLinks() {
    return links;
  }

  public void setLinks(VideoLinks links) {
    this.links = links;
  }
    
}
