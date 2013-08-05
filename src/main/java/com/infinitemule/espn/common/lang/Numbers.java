/*
 * Spring ESPN
 */
package com.infinitemule.espn.common.lang;


/**
 * Common functionality for working with Number types 
 */
public class Numbers {

  /**
   * 
   */
  public static Boolean isPresent(Integer i) {
    
    if(i == null) {
      return false;
    }
    
    return  true;
  }
  
}
