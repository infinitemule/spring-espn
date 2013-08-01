package com.infinitemule.espn.api.athletes.spring;

import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.athletes.AthletesApiRequest;
import com.infinitemule.espn.api.athletes.AthletesApiResponse;
import com.infinitemule.espn.api.athletes.AthletesApiService;
import com.infinitemule.espn.common.api.EspnApiServiceSpring;

/**
 * 
 */
@Component
public class AthletesApiServiceSpring extends    EspnApiServiceSpring 
                                       implements AthletesApiService {

  @Override
  public AthletesApiResponse call(AthletesApiRequest request) {
    return call(request, AthletesApiResponse.class);
  }

}
