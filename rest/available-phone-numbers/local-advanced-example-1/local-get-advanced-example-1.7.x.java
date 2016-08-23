// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.availablephonenumbercountry.Local;
import com.twilio.rest.api.v2010.account.incomingphonenumber.LocalCreator;
import com.twilio.type.PhoneNumber;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<Local> numbers = Local.read("US")
        .byContains("555")
        .byNearLatLong("37.840699,-122.461853")
        .byDistance(50)
        .byInRegion("CA")
        .execute();

    PhoneNumber availableNumber = numbers.iterator().next().getPhoneNumber();

    new LocalCreator(availableNumber).execute();
  }
}
