package mk.ukim.finki.emt.facility.domain.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import mk.ukim.finki.emt.sharedkernel.domain.address.Address;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
public class Facility extends AbstractEntity<FacilityId> {
    @Embedded
    Address address;
}
