/**
 * 
 */
package com.infinitemule.espn.common.api;


/**
 * 
 */
public class ApiUrls {

  public static final String scheme  = "http";
  public static final String host    = "api.espn.com";
  public static final String version = "/v1";

  /*
   * Parameters common to all methods 
   */
  
  public class Common {
    
    public class Params {
    
      public static final String limit   = "limit";
      public static final String offset  = "offset";
      public static final String lang    = "lang";
      public static final String accept  = "_accept";
    }
    
  }

  
  /*
   * Now API
   * 
   * http://developer.espn.com/docs/now
   */
  
  public class Now {
    
    public static final String now     = "/now";
    public static final String top     = now + "/top";
    public static final String popular = now+ "/popular";
    
    public class Params {
      
      public static final String leagues = "leagues";
      public static final String groups  = "groups";
      public static final String teams   = "teams";
      public static final String content = "content";
      public static final String disable = "disable";
      public static final String region  = "region";
            
    }
      
  }
  
  /*
   * Headlines API
   */
  
  public class Headlines {
    
    public class Params {
      
      public static final String city  = "city";
      public static final String sport = "sport";
      public static final String dates = "dates";
      
    }
    
    public static final String news         = "/news";
    public static final String headlines    = "/news/headlines";
    public static final String topHeadlines = "/news/headlines/top";
    
    public static final String byStory = "/news/{id}";
    
    public static final String allCities  = "/cities";
    public static final String byCity     = "/cities/{city}";
    
    public static final String espnW        = "/espnw";
    public static final String espnMagazine = "/magazine";
    
    public static final String allFantasy     = "/fantasy";
    public static final String byFantasySport = "/fantasy/{sport}";
    
  }
  
  
  /*
   * Sports API
   */
  
  public class Sports {
    
    public static final String all = "/sports";
    public static final String byName          = "/sports/{sport}";
    public static final String byNameAndLeague = "/sports/{sport}/{league}";
    
  }
  
  public class Teams {
    
    public static final String bySportAndLeague = Sports.byNameAndLeague + "/teams";
    
  }
   
}
