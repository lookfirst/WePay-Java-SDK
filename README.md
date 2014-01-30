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
	<version>2.0.0</version>
</dependency>
```

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

A: I don't have any connection with WePay other than I'm just a happy user of their product. They've been really responsive to me and I just wanted to give back a bit.
