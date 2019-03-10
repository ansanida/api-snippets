// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC8c0acc2e85428d14e27d1d54b849e0f2";
    public static final String AUTH_TOKEN =
            "7fb7f636beca9a939fb3c1f6e5bd537b";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+15183340698"), // to
                        new PhoneNumber("+17325323669"), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}
