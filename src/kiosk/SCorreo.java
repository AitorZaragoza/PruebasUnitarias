package kiosk;

import data.DigitalSignature;
import data.MailAddress;
import services.MailerService;

public class SCorreo implements MailerService {
    @Override
    public void send(MailAddress address, DigitalSignature signature) {

        System.out.print ("Mensaje enviado");
    }
}
