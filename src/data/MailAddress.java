package data;

/**
 * Adreça de correu electrònic que facilita el votant.
 */

final class MailAddress {

    private final String address;

    public MailAddress(String address) {
        this.address = address;
    }

    public String getAdress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailAddress address1 = (MailAddress) o;
        return address.equals(address1.address);
    }

    @Override
    public int hashCode() {
        return address.hashCode();
    }

    @Override
    public String toString() {
        return "Address{" + "address='" + address + '\'' + '}';
    }
}