package com.infinitemule.espn.api.now;

import java.util.ArrayList;
import java.util.List;

import com.infinitemule.espn.common.api.PageableApiResponse;

/**
 * 
 */
public class NowApiResponse extends PageableApiResponse {
  
  private List<Feed> breakingNews = new ArrayList<Feed>();  
  private List<Feed> feed         = new ArrayList<Feed>();

  public List<Feed> getFeed() {
    return feed;
  }

  public void setFeed(List<Feed> feed) {
    this.feed = feed;
  }

  public List<Feed> getBreakingNews() {
    return breakingNews;
  }

  public void setBreakingNews(List<Feed> breakingNews) {
    this.breakingNews = breakingNews;
  }    
    
}
