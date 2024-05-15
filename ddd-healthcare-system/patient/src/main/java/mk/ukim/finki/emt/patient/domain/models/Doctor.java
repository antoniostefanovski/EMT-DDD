package mk.ukim.finki.emt.patient.domain.models;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Doctor extends AbstractEntity<DoctorId> {
    private String name;
    private String specialization;
    private List<LocalDate> schedules;
}