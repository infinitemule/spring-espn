/*
 * 
 */
package com.infinitemule.espn.common.api;

/**
 * 
 */
public abstract class ApiRequest {

  private Language language = Language.English;
  private Output   accept   = Output.JSON; 

  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public Output getAccept() {
    return accept;
  }

  public void setAccept(Output accept) {
    this.accept = accept;
  }
    
    
}
