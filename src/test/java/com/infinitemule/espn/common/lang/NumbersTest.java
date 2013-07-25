/*
 * Spring ESPN
 */
package com.infinitemule.espn.common.lang;

import static junit.framework.Assert.*;

import org.junit.Test;

/**
 * 
 */
public class NumbersTest {

  @Test
  public void isPresentYes() {
    
    Integer i = new Integer(199);
    
    assertTrue(Numbers.isPresent(i));
    
  }

  
  @Test
  public void isPresentNo() {
    
    Integer i = null;
    
    assertFalse(Numbers.isPresent(i));
    
  }
  
}
