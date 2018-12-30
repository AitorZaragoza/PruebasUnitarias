package data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class NifTest {

    @Test
    public void TestEquals(){
        Nif nif = new Nif("74415269C");
        Nif nif2 = new Nif("74415269C");
        assertTrue(nif.equals(nif2));
    }

    @Test
    public void TestHashCode(){
        Nif nif = new Nif ("72364516Y");
        Nif nif2 = new Nif ("72364516Y");
        assertTrue(nif.hashCode()==nif2.hashCode());
    }

    @Test
    public void TesttoString(){
        Nif nf = new Nif("73256649P");
        String nf2 = "Nif{nif='73256649P'}";
        assertEquals(nf2, nf.toString());
    }


}
