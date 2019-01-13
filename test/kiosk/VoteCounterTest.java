package kiosk;


import static org.junit.jupiter.api.Assertions.assertEquals;
import data.Party;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;


public class VoteCounterTest {

    @Test
    public void Test(){

        Party partyB = new Party("");
        Party PP = new Party("PP");
        Party Podemos = new Party("Podemos");
        Party Ciudadanos = new Party("Ciudadanos");
        Party EsquerraRepublicana = new Party("EsquerraRepublicana");
        Party PSOE = new Party("PSOE");

        Set<Party> partidos = new HashSet<Party>();
        partidos.add(partyB);
        partidos.add(PP);
        partidos.add(Podemos);
        partidos.add(Ciudadanos);
        partidos.add(EsquerraRepublicana);
        partidos.add(PSOE);

        VoteCounter vc = new VoteCounter(partidos);

        vc.scrutinize(partyB);
        vc.scrutinize(PP);
        vc.scrutinize(PSOE);
        vc.scrutinize(EsquerraRepublicana);
        vc.scrutinize(PSOE);

        assertEquals(vc.getVotesFor(PSOE), 2);
        assertEquals(vc.getVotesFor(EsquerraRepublicana), 1);
        assertEquals(vc.getVotesFor(Podemos), 0);
        assertEquals(vc.getBlanks(), 1);
        assertEquals(vc.getTotal(), 5);
        assertEquals(vc.getNulls(), 0);

        vc.scrutinize(null);
        assertEquals(vc.getNulls(), 1);
    }

}

