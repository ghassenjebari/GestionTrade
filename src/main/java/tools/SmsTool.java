package tools;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsTool {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC39fa940bdd1be4d3294e6cb4f449bbba";
    public static final String AUTH_TOKEN = "669aad4fcdc1d184e435ab3930193822";

    public static void envoyer(String msg,String numDest) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(numDest),
                new PhoneNumber("+15672352667"),
                msg).create();

        System.out.println(message.getSid());
    }
}