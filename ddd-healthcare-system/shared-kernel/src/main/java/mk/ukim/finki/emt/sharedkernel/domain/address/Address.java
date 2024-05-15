package mk.ukim.finki.emt.sharedkernel.domain.address;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Address implements ValueObject {
    String street;
    String city;
    String postalCode;
    String country;

    public Address() {

    }

    public String formatAddress() {
        return this.street + " " + this.city + " " + this.postalCode + " " + this.country;
    }

    public boolean compareAddresses(Address address1, Address address2) {
        return address1.equals(address2);
    }

    public Address(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }
}
