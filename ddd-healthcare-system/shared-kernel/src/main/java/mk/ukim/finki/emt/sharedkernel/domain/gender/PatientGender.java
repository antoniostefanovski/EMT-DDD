package mk.ukim.finki.emt.sharedkernel.domain.gender;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
public class PatientGender implements ValueObject {

    @Enumerated(value = EnumType.STRING)
    private final Gender gender;

    protected PatientGender() {
        this.gender = Gender.MALE;
    }

    public PatientGender(@NonNull Gender gender) {
        this.gender = gender;
    }
}
