package com.infinitemule.espn.common.api;


public class Video {

  private Integer id;
  private String  title;
  private String  thumbnail;
  private String  description;
  private String  headline;
  
  private String lastModified;
  private String originalPublishDate; 
    
  private VideoLinks links;

  private PosterImages posterImages;
  
  private Tracking tracking;
  
  
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

  public Tracking getTracking() {
    return tracking;
  }

  public void setTracking(Tracking tracking) {
    this.tracking = tracking;
  }

  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public String getOriginalPublishDate() {
    return originalPublishDate;
  }

  public void setOriginalPublishDate(String originalPublishDate) {
    this.originalPublishDate = originalPublishDate;
  }

  public PosterImages getPosterImages() {
    return posterImages;
  }

  public void setPosterImages(PosterImages posterImages) {
    this.posterImages = posterImages;
  }
     
  
}
