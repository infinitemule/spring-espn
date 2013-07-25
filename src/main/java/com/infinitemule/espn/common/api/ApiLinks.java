/**
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;


/**
 * 
 */
public class ApiLinks extends AbstractLinks {

  private Link news;
  private Link headlines;
  private Link notes;
  private Link events;

  private Link self;
  
  
  /**
   * 
   */
  public String getNewsUrl() {
    return getUrl(getNews());
  }

  
  /**
   * 
   */
  public String getHeadlinesUrl() {
    return getUrl(getHeadlines());
  }
  
  
  /**
   * 
   */
  public String getNotesUrl() {    
    return getUrl(getNotes());
  }
  
  
  /**
   * 
   */
  public String getEventsUrl() {         
    return getUrl(getEvents());
  }

  
  /*
   * 
   */
  
  public Link getNews() {
    return news;
  }
  
  public void setNews(Link news) {
    this.news = news;
  }
  
  public Link getHeadlines() {
    return headlines;
  }
  
  public void setHeadlines(Link headlines) {
    this.headlines = headlines;
  }
  
  public Link getNotes() {
    return notes;
  }
  
  public void setNotes(Link notes) {
    this.notes = notes;
  }
  
  public Link getEvents() {
    return events;
  }
  
  public void setEvents(Link events) {
    this.events = events;
  }

  public Link getSelf() {
    return self;
  }

  public void setSelf(Link self) {
    this.self = self;
  }
    
  
}
