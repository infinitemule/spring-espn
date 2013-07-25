package com.infinitemule.espn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public abstract class AbstractAppConfig {

  @Autowired
  protected Environment env;
  
  
  @Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    
    PropertySourcesPlaceholderConfigurer props = 
        new PropertySourcesPlaceholderConfigurer();
    
    props.setLocations(new Resource[] {
       new ClassPathResource("espn-api.properties"),
       new ClassPathResource("espn-api-key.properties"),       
    });

    props.setIgnoreUnresolvablePlaceholders(true);
    
    return props;
  }
    
  
  /**
   * 
   */
  protected Boolean getBooleanProperty(String name) {
    return env.getProperty(name, Boolean.class);
  }
    
}
