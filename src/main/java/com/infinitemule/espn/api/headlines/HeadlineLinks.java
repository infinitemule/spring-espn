/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.headlines;

import com.infinitemule.espn.common.api.ApiLinks;
import com.infinitemule.espn.common.api.Link;

public class HeadlineLinks {

  private ApiLinks api;
  private Link     web;
  private Link     mobile;
  
  public ApiLinks getApi() {
    return api;
  }
  
  public void setApi(ApiLinks api) {
    this.api = api;
  }
  
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
    
}
