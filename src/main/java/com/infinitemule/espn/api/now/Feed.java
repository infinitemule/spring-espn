/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.now;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.infinitemule.espn.common.api.NewsCategory;
import com.infinitemule.espn.common.api.Image;
import com.infinitemule.espn.common.api.Video;

/**
 * 
 */
public class Feed {

  private Integer id;
  
  private String type;  
  private String headline;
  private String title;
  private String byline;
  
  private String section;  
  private String source;
  private String description;
  
  private Date published;
  private Date lastModified;
  
  private String linkText;
  private FeedLinks links;
  
  private Boolean premium;
  
  private List<NewsCategory> categories = new ArrayList<NewsCategory>();  
  private List<Image>        images     = new ArrayList<Image>();
  private List<Video>        video      = new ArrayList<Video>();
  
  
  /*
   * These are currently undocumented and will sometimes show up as
   * an empty array. 
   */
  
  @JsonIgnore
  private List<String> related;
  
  @JsonIgnore
  private List<String> metrics;
  
  
  public Feed() {
    
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getPublished() {
    return published;
  }

  public void setPublished(Date published) {
    this.published = published;
  }

  public Date getLastModified() {
    return lastModified;
  }

  public void setLastModified(Date lastModified) {
    this.lastModified = lastModified;
  }

  public Boolean getPremium() {
    return premium;
  }

  public void setPremium(Boolean premium) {
    this.premium = premium;
  }

  public String getByline() {
    return byline;
  }

  public void setByline(String byline) {
    this.byline = byline;
  }

  public String getLinkText() {
    return linkText;
  }

  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public FeedLinks getLinks() {
    return links;
  }

  public void setLinks(FeedLinks links) {
    this.links = links;
  }

  public List<NewsCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<NewsCategory> categories) {
    this.categories = categories;
  }

  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public List<Video> getVideo() {
    return video;
  }

  public void setVideo(List<Video> video) {
    this.video = video;
  }

  
  public List<String> getRelated() {
    return related;
  }

  public void setRelated(List<String> related) {
    this.related = related;
  }

  public List<String> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }
             
}
