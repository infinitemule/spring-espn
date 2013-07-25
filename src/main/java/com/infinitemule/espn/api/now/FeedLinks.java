package com.infinitemule.espn.api.now;

import com.infinitemule.espn.common.api.AbstractLinks;
import com.infinitemule.espn.common.api.ApiLinks;
import com.infinitemule.espn.common.api.Link;

/**
 * 
 */
public class FeedLinks extends AbstractLinks {

  private Link web;
  private Link mobile;
  
  private ApiLinks api;
  
  
  public String getWebUrl() {
    return getUrl(getWeb());
  }
  
  public String getMobileUrl() {
    return getUrl(getMobile());
  }
  
  
  /*
   * 
   */
  
  public Link getWeb() {
    return web;
  }
  
  public void setWeb(Link web) {
    this.web = web;
  }
  
  public Link getMobile() {
    return mobile;
  }
  
  public void setMobile(Link mobile) {
    this.mobile = mobile;
  }

  public ApiLinks getApi() {
    return api;
  }

  public void setApi(ApiLinks api) {
    this.api = api;
  }  
  
  
}
