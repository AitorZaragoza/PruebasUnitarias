package kiosk;

import data.Party;
import data.DigitalSignature;
import data.MailAddress;
import org.junit.jupiter.api.Test;



public class SCorreoTest {



    @Test
    public void sendTest(){
        OrganismoE oe = new OrganismoE();
        Party PP = new Party("PP");
        MailAddress address = new MailAddress("paulaaitor@gmail.com");
        DigitalSignature digitalSignature = oe.askForDigitalSignature(PP);

        SCorreo scorreo = new SCorreo();
        //assertSame("Mensaje enviado", scorreo.send(address, digitalSignature));

    }
}
