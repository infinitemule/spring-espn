package com.infinitemule.espn.domain.sport.api;

public class TeamLinks {

  private TeamApiLinks    api;
  private TeamWebLinks    web;
  private TeamMobileLinks mobile;
  
  public TeamLinks() {}

  public TeamApiLinks getApi() {
    return api;
  }

  public void setApi(TeamApiLinks api) {
    this.api = api;
  }

  public TeamWebLinks getWeb() {
    return web;
  }

  public void setWeb(TeamWebLinks web) {
    this.web = web;
  }

  public TeamMobileLinks getMobile() {
    return mobile;
  }

  public void setMobile(TeamMobileLinks mobile) {
    this.mobile = mobile;
  }
    
  
}
