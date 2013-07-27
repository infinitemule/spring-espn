/*
 * Spring ESPN
 */
package com.infinitemule.espn.api.athletes;

/**
 * 
 */
public class AthleteLinks {

  private AthleteApiLinks api;
  private AthleteApiLinks web;
  private AthleteApiLinks mobile;
  
  public AthleteApiLinks getApi() {
    return api;
  }
  
  public void setApi(AthleteApiLinks api) {
    this.api = api;
  }
  
  public AthleteApiLinks getWeb() {
    return web;
  }
  
  public void setWeb(AthleteApiLinks web) {
    this.web = web;
  }
  
  public AthleteApiLinks getMobile() {
    return mobile;  
  }
  
  public void setMobile(AthleteApiLinks mobile) {
    this.mobile = mobile;
  }
    
}
