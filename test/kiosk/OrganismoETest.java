package kiosk;


import data.Nif;
import org.junit.jupiter.api.Test;
import kiosk.OrganismoE;
import services.ElectoralOrganism;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganismoETest {

    @Test
    public void canVoteTest(){
        Nif niftrue = new Nif("73564125B");
        Nif niffalse = new Nif("78452314M");
        OrganismoE organism = new OrganismoE();

        assertEquals(true, organism.canVote(niftrue));
        assertEquals(false, organism.canVote(niffalse));
    }
}
