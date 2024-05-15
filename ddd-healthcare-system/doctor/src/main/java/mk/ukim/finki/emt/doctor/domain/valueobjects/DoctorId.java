package mk.ukim.finki.emt.doctor.domain.valueobjects;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class DoctorId extends DomainObjectId {
    public DoctorId() {
        super(DoctorId.randomId(DoctorId.class).getId());
    }
}
