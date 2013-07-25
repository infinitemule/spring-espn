package com.infinitemule.espn.common.api;

/**
 * 
 */
public class Language {

  public static final Language English = new Language("en", "English");
  public static final Language Spanish = new Language("es", "Spanish");
  
  private String abbr;
  private String name;
  
  private Language(String abbr, String name) {
    setAbbr(abbr);
    setName(name);    
  }

  public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
    
}
