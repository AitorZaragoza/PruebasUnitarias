package data;

import java.util.Arrays;

final public class DigitalSignature {

    private final byte[] digitalsignature;

    public DigitalSignature(byte[] digitalsignature) {
        this.digitalsignature = digitalsignature;
    }

    public byte[] getDigitalsignature() {
        return digitalsignature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalSignature digitalsignature1 = (DigitalSignature) o;
        return Arrays.equals(digitalsignature, digitalsignature1.digitalsignature);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(digitalsignature);
    }

    @Override
    public String toString(){
        return "DigitalSignature{" + "digitalsignature='" + Arrays.toString(digitalsignature) + '\'' + '}';
    }

}
