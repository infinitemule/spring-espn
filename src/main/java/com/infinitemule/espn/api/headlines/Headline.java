/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.headlines;

import java.util.Date;
import java.util.List;

import com.infinitemule.espn.common.api.Audio;
import com.infinitemule.espn.common.api.Image;
import com.infinitemule.espn.common.api.NewsCategory;
import com.infinitemule.espn.common.api.Video;


public class Headline {

  private Integer id;
  private Integer gameId;
  
  private String title;
  private String headline;
  private String byline;
  
  private String source;
  private String type;

  private String story;
  private String mobileStory;
  private String description;
  
  private Date published;
  private Date lastModified;

  private String linkText;
  private String shortLinkText;
  
  private List<NewsCategory> categories;
  private List<String>       keywords;
  private HeadlineLinks      links;
  
  private String premium;
  
  private List<Image> images;
  private List<Audio> audio;
  private List<Video> video;

  private List<HeadlineRelated> related;

  
  
  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
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

  public String getByline() {
    return byline;
  }

  public void setByline(String byline) {
    this.byline = byline;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStory() {
    return story;
  }

  public void setStory(String story) {
    this.story = story;
  }

  public String getMobileStory() {
    return mobileStory;
  }

  public void setMobileStory(String mobileStory) {
    this.mobileStory = mobileStory;
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

  public String getLinkText() {
    return linkText;
  }

  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }

  public String getShortLinkText() {
    return shortLinkText;
  }

  public void setShortLinkText(String shortLinkText) {
    this.shortLinkText = shortLinkText;
  }

  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public List<Audio> getAudio() {
    return audio;
  }

  public void setAudio(List<Audio> audio) {
    this.audio = audio;
  }

  public String getPremium() {
    return premium;
  }

  public void setPremium(String premium) {
    this.premium = premium;
  }

  public HeadlineLinks getLinks() {
    return links;
  }

  public void setLinks(HeadlineLinks links) {
    this.links = links;
  }

  public List<HeadlineRelated> getRelated() {
    return related;
  }

  public void setRelated(List<HeadlineRelated> related) {
    this.related = related;
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

  public List<NewsCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<NewsCategory> categories) {
    this.categories = categories;
  }

  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }
              
}
