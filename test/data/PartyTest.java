package data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PartyTest {

    @Test
    public void TestEquals(){
        Party party = new Party("Equals");
        Party party2 = new Party ("Equals");
        assertTrue(party.equals(party2));
    }


    @Test
    public void TestHashCode(){
        Party party = new Party ("HC");
        Party party2 = new Party ("HC");
        assertTrue(party.hashCode()==party2.hashCode());
    }

    @Test
    public void TesttoString(){
        Party party = new Party("Afirmative");
        String parties = "Party{name='Afirmative'}";
        assertEquals(parties,party.toString());
    }

}
