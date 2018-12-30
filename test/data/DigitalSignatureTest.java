package data;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class DigitalSignatureTest {

    @Test
    public void TestEquals(){
        DigitalSignature digitalsignature = new DigitalSignature("Equals".getBytes());
        DigitalSignature digitalsignature2 = new DigitalSignature("Equals".getBytes());
        assertTrue(digitalsignature.equals(digitalsignature2));
    }

    @Test
    public void TestHashCode(){
        DigitalSignature digitalsignature = new DigitalSignature ("HC".getBytes());
        DigitalSignature digitalsignature2 = new DigitalSignature ("HC".getBytes());
        assertTrue(digitalsignature.hashCode()==digitalsignature2.hashCode());
    }

    @Test
    public void TesttoString(){
        DigitalSignature digitalsignature = new DigitalSignature("Signed".getBytes());
        String digitalsignature2 = "DigitalSignature{digitalsignature='"+
                Arrays.toString("Signed".getBytes()) + "'}";
        assertEquals(digitalsignature2,digitalsignature.toString());
    }

}
