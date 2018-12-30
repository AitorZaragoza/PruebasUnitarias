package data;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class MailAddressTest {

    @Test
    public void TestEquals(){
        MailAddress ma = new MailAddress("Equals");
        MailAddress ma2 = new MailAddress ("Equals");
        assertTrue(ma.equals(ma2));
    }

    @Test
    public void TestHashCode(){
        MailAddress ma = new MailAddress ("HC");
        MailAddress ma2 = new MailAddress ("HC");
        assertTrue(ma.hashCode()==ma2.hashCode());
    }

    @Test
    public void TesttoString(){
        MailAddress ma = new MailAddress("Afirmative");
        String ma2 = "Address{address='Afirmative'}";
        assertEquals(ma2,ma.toString());
    }

}