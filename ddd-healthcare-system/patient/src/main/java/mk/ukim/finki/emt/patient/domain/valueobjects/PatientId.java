package mk.ukim.finki.emt.patient.domain.valueobjects;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class PatientId extends DomainObjectId {
    public PatientId() {
        super(PatientId.randomId(PatientId.class).getId());
    }
}
