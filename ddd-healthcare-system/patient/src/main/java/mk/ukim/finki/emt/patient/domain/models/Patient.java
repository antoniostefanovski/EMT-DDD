package mk.ukim.finki.emt.patient.domain.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.gender.PatientGender;

import java.time.LocalDate;

@Entity
public class Patient extends AbstractEntity<PatientId> {
    private String name;
    private LocalDate dateOfBirth;
    @Embedded
    private PatientGender gender;

}
