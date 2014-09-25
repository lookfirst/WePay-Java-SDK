WePay Java SDK

This API implements v2 of the WePay API.

It is documented on their website:

https://www.wepay.com/developer/reference

If you have any questions, feel free to contact me at latchkey@gmail.com

Maven
-----

```
<dependency>
    <groupId>com.github.lookfirst</groupId>
	<artifactId>WePay-Java-SDK</artifactId>
	<version>2.0.9</version>
</dependency>
```

To do a release: `mvn clean deploy; mvn release:clean; mvn release:prepare; mvn release:perform`

How to use
-----------

First, become familiar with how their API works (see link above). Then, this is some code to get you started...

    // Get an instance of the API. It is threadsafe.
    WePayApi api = new WePayApi(new WePayKey(clientId, clientSecret, production));

    // Generate a auth url
    String url = api.getAuthorizationUri(Scope.getAll(), authRedirectUrl, myState);

    // Use the code to generate a token.
    Token token = api.getToken(code, authRedirectUrl);

    // Getting details about a user using an AccessToken
    WePayUser user = api.execute(token.getAccessToken(), new UserRequest());


Frequently Asked Questions
--------------------------

Q: What is the license on this code?

A: MIT License

Q: Is this an official API from WePay?

A: No. I don't have any connection with WePay other than I'm just a happy user of their product. They've been really responsive to me and I just wanted to give back a bit.

Q: How is this project different from the one provided by WePay?

A: We use Maven to do the build and the jar is deployed to Maven Central. The JSON serialization is performed using Jackson (cleaner) vs. GSON. We don't inflict you with dealing with OAuth2 as part of the API. One can argue that this project is more 'Java friendly' as the other API feels like it is written by someone new to Java. Honestly, we have no idea why WePay built their own.
