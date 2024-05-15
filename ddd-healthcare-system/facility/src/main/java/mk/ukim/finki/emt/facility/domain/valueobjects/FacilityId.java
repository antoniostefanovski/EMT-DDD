package mk.ukim.finki.emt.facility.domain.valueobjects;

import jakarta.persistence.Embeddable;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

@Embeddable
public class FacilityId extends DomainObjectId {

    public FacilityId() {
        super(FacilityId.randomId(FacilityId.class).getId());
    }

}
