/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.sports;

/**
 * 
 */
public class Week {

  private Integer number;
  
  private String startDate;
  private String endDate;
  private String text; 

  public Week() {
        
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }  
    
}
