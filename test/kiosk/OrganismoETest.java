package kiosk;


import data.DigitalSignature;
import data.Nif;
import data.Party;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganismoETest {
    OrganismoE organism = new OrganismoE();

    @Test
    public void canVoteTest(){
        Nif niftrue = new Nif("73564125B");
        Nif niffalse = new Nif("78452314M");

        assertEquals(true, organism.canVote(niftrue));
        assertEquals(false, organism.canVote(niffalse));
    }

    @Test
    public void askForDigitalSignatureTest(){
        Party PP = new Party("PP");
        DigitalSignature ds = new DigitalSignature("PP".getBytes());

        assertEquals(ds, organism.askForDigitalSignature(PP));

    }
}
