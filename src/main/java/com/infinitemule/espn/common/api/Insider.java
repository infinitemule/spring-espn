/*
 * Spring ESPN
 */
package com.infinitemule.espn.common.api;

public class Insider {

  public static final Insider Yes  = new Insider("yes");
  public static final Insider No   = new Insider("no");
  public static final Insider Only = new Insider("only");
  
  private String id;
  
  private Insider(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
    
}
