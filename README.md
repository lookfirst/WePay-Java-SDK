WePay Java SDK

This API implements v2 of the WePay API.

It is documented on their website:

https://www.wepay.com/developer/reference

If you have any questions, feel free to contact me at latchkey@gmail.com

How to use
-----------

First, become familiar with how their API works (see link above). Then, this is some code to get you started...

    // Get an instance of the API. It is threadsafe.
    WePayApi api = new WePayApi(new WePayKey(clientId, clientSecret, production));

    // Generate a auth url
    String url = api.getAuthorizationUri(Scope.getAll(), authRedirectUrl, myState);

    // Use the code to generate a token.
    WePayTokenResponse token = api.getToken(code, authRedirectUrl);

    // Getting details about a user using an AccessToken
    WePayUserResponse resp = api.execute(wePayAccount.getAccessToken(), new WePayUserDetails());


Frequently Asked Questions
--------------------------

Q: Why isn't the whole API here?

A: I just haven't implemented it yet. If you'd like to send me a pull request with a nicely formatted diff, I'd be more than happy to integrate it. Otherwise, you can wait until I have time or need the rest of it myself. ;-)

Q: What are the dependencies?

A: Jackson, Commons-Lang3, Slf4j. I also use Lombok to save me some typing. If you import the project into Eclipse, you will need to also install Lombok. Just double click the lombok.jar and restart Eclipse.