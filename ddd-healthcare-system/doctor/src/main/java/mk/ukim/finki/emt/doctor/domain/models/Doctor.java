package mk.ukim.finki.emt.doctor.domain.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
public class Doctor extends AbstractEntity<DoctorId> {
    private String name;
    private String specialization;
    private List<LocalDate> schedules;

    public static Doctor build(String name, String specialization) {
        Doctor d = new Doctor();
        d.name = name;
        d.specialization = specialization;
        return d;
    }

    private Doctor() {
        super(mk.ukim.finki.emt.doctor.domain.valueobjects.DoctorId.randomId(DoctorId.class));
    }

}
