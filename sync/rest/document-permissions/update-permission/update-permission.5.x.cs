// Download the twilio-csharp library from twilio.com/docs/libraries/csharp
using System;
using Newtonsoft.Json;
using Twilio;
using Twilio.Exceptions;
using Twilio.Rest.Preview.Sync.Service.Document;

public class Example
{
    public static void Main(string[] args)
    {
        // Find your Account SID and Auth Token at twilio.com/console
        const string accountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        const string authToken = "your_auth_token";
        const string serviceSid = "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        TwilioClient.Init(accountSid, authToken);

        try
        {
            DocumentPermissionResource.Update(serviceSid, "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "bob", true, true, true);
        }
        catch (ApiException err)
        {
            Console.WriteLine(err.Message);
        }
    }
}
