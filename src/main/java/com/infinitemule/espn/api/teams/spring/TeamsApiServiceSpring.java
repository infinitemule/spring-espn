package com.infinitemule.espn.api.teams.spring;

import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.teams.TeamsApiRequest;
import com.infinitemule.espn.api.teams.TeamsApiResponse;
import com.infinitemule.espn.api.teams.TeamsApiService;
import com.infinitemule.espn.common.api.EspnApiServiceSpring;


@Component
public class TeamsApiServiceSpring extends    EspnApiServiceSpring 
                                   implements TeamsApiService {
  
  @Override
  public TeamsApiResponse call(TeamsApiRequest request) {
    return call(request, TeamsApiResponse.class);
  }

}
