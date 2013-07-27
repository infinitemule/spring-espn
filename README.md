Spring ESPN
===========

Spring / Java library for accessing the [ESPN API](http://developer.espn.com/).

### Notes
- Create a file called `api-key.txt` in the root directory and specify your API key as 
`api-key=<your_api_key_here>`.  Maven will then filter resources based on the file 
so you don't have to store your API key in git.
- Only the public APIs are implemented, I can't test the partner, premium partner,
or ESPN access tiers so I didn't bother implementing them.
- All option combinations should be implemented but I need to go back to each
service and make sure
- Set `espn-spring.fail-on-unknown-props` to `false` in production. That way, it won't throw 
an exception in production on new fields, it will just ignore them.  Set it to `true` 
in development so that you get an exception on an unrecognized field, which will tell you 
that ESPN updated their API.
- I still need to add examples on how to use the services.
- Error handling is not very robust. 

Contact me with any questions or feedback.

![Built with the ESPN API](http://a.espncdn.com/i/apis/attribution/espn-api-silver_150.png)