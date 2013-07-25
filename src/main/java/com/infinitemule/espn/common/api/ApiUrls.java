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

  public class Common {
    
    public class Params {
    
      public static final String limit   = "limit";
      public static final String offset  = "offset";
      public static final String lang    = "lang";
      public static final String accept  = "_accept";
    }
    
  }

  
   
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
  
  public class Sports {
    
    public static final String all = "/sports";
    public static final String byName          = all + "/{sport}";
    public static final String byNameAndLeague = all + "/{sport}/{league}";
    
  }
  
  public class Teams {
    
    public static final String bySportAndLeague = Sports.byNameAndLeague + "/teams";
    
  }
   
}
