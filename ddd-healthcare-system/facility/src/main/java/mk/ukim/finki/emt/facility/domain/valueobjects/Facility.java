package mk.ukim.finki.emt.facility.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.address.Address;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Getter
public class Facility implements ValueObject {

    private final FacilityId id;
    private final Address address;

    private Facility () {
        this.id =  FacilityId.randomId(FacilityId.class);
        this.address = new Address("street", "city", "postalcode", "");
    }

    @JsonCreator
    public Facility(@JsonProperty("id") FacilityId id,
                    @JsonProperty("address") Address address) {
        this.id = id;
        this.address = address;
    }
}
