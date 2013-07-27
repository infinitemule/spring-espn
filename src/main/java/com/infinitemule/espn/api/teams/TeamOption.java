/**
 * Spring ESPN
 */
package com.infinitemule.espn.api.teams;

/**
 * 
 */
public class TeamOption {

  public static final TeamOption Venues  = new TeamOption("venues");
  public static final TeamOption Stats   = new TeamOption("stats");
  public static final TeamOption Roster  = new TeamOption("roster");
  public static final TeamOption Leaders = new TeamOption("leaders");
  

  private String name;

  private TeamOption(String name) {
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
      
}
