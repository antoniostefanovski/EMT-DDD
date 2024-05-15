package mk.ukim.finki.emt.patient.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;
import mk.ukim.finki.emt.sharedkernel.domain.gender.Gender;

import java.time.LocalDate;

@Getter
public class Patient implements ValueObject {
    private final PatientId id;
    private final String name;
    private final LocalDate dateOfBirth;
    private final Gender gender;

    private Patient() {
        this.id = PatientId.randomId(PatientId.class);
        this.name = "Antonio";
        this.dateOfBirth = LocalDate.of(2024, 10, 25);
        this.gender = Gender.MALE;
    }

    @JsonCreator
    public Patient(@JsonProperty("id") PatientId id,
                   @JsonProperty("name") String name,
                   @JsonProperty("dateOfBirth") LocalDate dateOfBirth,
                   @JsonProperty("gender") Gender gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
}
