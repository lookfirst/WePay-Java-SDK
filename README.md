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
    Token token = api.getToken(code, authRedirectUrl);

    // Getting details about a user using an AccessToken
    WePayUser user = api.execute(token.getAccessToken(), new UserRequest());


Frequently Asked Questions
--------------------------

Q: What is the license on this code?

A: MIT License

Q: How do I build a jar file?

A: Clone the project and then type: 'ant jar'

Q: Why isn't this in a Maven repo? Will you add a pom file?

A: Maven is a steaming pile of dog :poop: . This API should never be included in any public repo. I won't ever support Maven here.

Q: Is this an official API from WePay?

A: I don't have any connection with WePay other than I'm just a happy user of their product. They've been really responsive to me and I just wanted to give back a bit.

Q: What are the dependencies?

A: Jackson, Commons-IO, Commons-Lang3, Slf4j. All of the jar files are in the lib directory. I also use Lombok to save me a lot of typing. You don't need lombok to use the API. If you import the project into Eclipse, you will need to also install Lombok. Just double click the lombok.jar and restart Eclipse.