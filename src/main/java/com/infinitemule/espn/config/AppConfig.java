/**
 * 
 */
package com.infinitemule.espn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infinitemule.espn.common.api.ApiResponseErrorHandler;




@Configuration
@ComponentScan({"com.infinitemule.espn"})
@PropertySource({"classpath:espn-spring.properties"})
public class AppConfig extends AbstractAppConfig {

    
  @Bean
  public ObjectMapper mapper() {
        
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(
        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,         
        getBooleanProperty("espn-spring.fail-on-unknown-props"));
    
    return objectMapper; 
  }
  
  @Bean
  public RestTemplate restTemplate() {
    
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.setErrorHandler(new ApiResponseErrorHandler());
    
    return restTemplate;
  }
  
}
