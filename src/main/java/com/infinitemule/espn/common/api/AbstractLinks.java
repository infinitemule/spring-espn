package com.infinitemule.espn.common.api;

import static org.apache.commons.lang3.StringUtils.defaultIfBlank;

/**
 * 
 */
public abstract class AbstractLinks {

  protected String getUrl(Link link) {
    
    if(link == null) {
      return "";
    }
    
    return defaultIfBlank(link.getHref(), "");
  }
  
}
