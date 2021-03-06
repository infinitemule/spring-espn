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
    
    public static final String latest  = "/now";
    public static final String top     = latest  + "/top";
    public static final String popular = latest + "/popular";
    
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
      
      public static final String city    = "city";
      public static final String sport   = "sport";
      public static final String league  = "league";
      public static final String dates   = "dates";
      public static final String insider = "insider";
      public static final String disable = "disable";
      public static final String region  = "region";
      
      public static final String id         = "id";
      public static final String teamId     = "teamId";
      public static final String athleteId  = "athleteId";
    }
    
    public static final String news         = "/news";
    public static final String headlines    = "/news/headlines";
    public static final String topHeadlines = "/news/headlines/top";
        
    
    public static final String allCities  = "/cities";
    public static final String byCity     = "/cities/{city}";
    
    public static final String espnW        = "/espnw";
    public static final String espnMagazine = "/magazine";
    
    public static final String allFantasy     = "/fantasy";
    public static final String byFantasySport = "/fantasy/{sport}";
    
    public static final String allSports        = "/sports";
    public static final String bySport          = "/sports/{sport}";
    public static final String bySportAndLeague = "/sports/{sport}/{league}";
    public static final String byTeam           = "/sports/{sport}/{league}/teams/{teamId}";
    public static final String byAthlete        = "/sports/{sport}/{league}/athletes/{athleteId}";
    public static final String byStory          = "/sports/news/{id}";
    
  }
  
  
  /*
   * Sports API (called the Helper API by ESPN)
   */
  
  public class Sports {
    
    public class Params {
      
      public static final String sport  = "sport";
      public static final String league = "league";
      
      
    }
    
    public static final String all             = "/sports";
    public static final String byName          = "/sports/{sport}";
    public static final String byNameAndLeague = "/sports/{sport}/{league}";
    
  }
  
  /*
   * Teams API
   */
  
  public class Teams {
    
    public class Params {
      
      public static final String sport   = "sport";
      public static final String league  = "league";
      public static final String groups  = "groups";
      public static final String options = "options";
      
    }
    
    public static final String bySport          = Sports.byName + "/teams";
    public static final String bySportAndLeague = Sports.byNameAndLeague + "/teams";
    
  }
   
  /*
   * Athletes API
   */
  
  public class Athletes {
    
    public class Params {
      public static final String id     = "id";
      public static final String sport  = "sport";
      public static final String league = "league";
      public static final String groups = "groups";
    }
    
    public static final String bySport          = Sports.byName + "/athletes";
    public static final String byAthlete        = Sports.byName + "/athletes/{id}";    
    public static final String bySportAndLeague = Sports.byNameAndLeague + "/athletes";
    
  }
  
}
