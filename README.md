Spring ESPN
===========

Spring / Java library for accessing the [ESPN API](http://developer.espn.com/).

### Notes
- Create a file called `espn-api-key.properties` in the classpath of your application with a property  
`espn.api-key=<your_api_key_here>`.  Do not store your API key in git or any SCM.  
- Only the public APIs are implemented, I can't test the partner, premium partner,
or ESPN access tiers so I didn't bother implementing them.
- All option combinations should be implemented but I need to go back to each
service and make sure
- Set `espn-spring.fail-on-unknown-props` to `false` in production. That way, it won't throw 
an exception in production on new fields, it will just ignore them.  Set it to `true` 
in development so that you get an exception on an unrecognized field, which will tell you 
that ESPN updated their API.
- I still need to add examples on how to use the services.  Currently, you can find some
in the [integration tests](https://github.com/infinitemule/spring-espn-intg-test)
- Error handling is not very robust. 

Contact me with any questions or feedback.

![Built with the ESPN API](http://a.espncdn.com/i/apis/attribution/espn-api-silver_150.png)