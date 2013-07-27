package com.infinitemule.espn.api.teams.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.teams.TeamsApiRequest;
import com.infinitemule.espn.api.teams.TeamsApiResponse;
import com.infinitemule.espn.api.teams.TeamsApiService;
import com.infinitemule.espn.common.api.ApiService;

@Component
public class TeamsApiServiceSpring implements TeamsApiService {

  @Autowired
  private ApiService service;
  
  @Override
  public TeamsApiResponse call(TeamsApiRequest request) {
    return service.call(request, TeamsApiResponse.class);
  }

}
