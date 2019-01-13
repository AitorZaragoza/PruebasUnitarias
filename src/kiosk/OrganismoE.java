package kiosk;

import data.DigitalSignature;
import data.Nif;
import data.Party;
import services.ElectoralOrganism;

public class OrganismoE implements ElectoralOrganism {
    boolean b = false;
    @Override
    public boolean canVote(Nif nif) {

        if (nif.getNif().equals("73564125B")) {
            return true;
        }
        return false;
    }

    @Override
    public void disableVoter(Nif nif) {
        b = true;
    }

    @Override
    public DigitalSignature askForDigitalSignature(Party party) {
        byte [] ejem = "PP".getBytes();
        return new DigitalSignature(ejem);
    }
}
